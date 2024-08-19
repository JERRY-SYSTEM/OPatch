function (auto_source_group _folder _base _pattern)
    if (ARGC GREATER 3)
        set(_exclude ${ARGN})
    else ()
        set(_exclude)
    endif ()
    file (GLOB _files RELATIVE ${CMAKE_CURRENT_SOURCE_DIR}/ ${_folder}/*)
    set (folder_files)
    foreach (_fname ${_files})
        if (IS_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}/${_fname})
            auto_source_group ("${_fname}" "${_base}" "${_pattern}" "${_exclude}")
        elseif (_fname MATCHES ${_pattern})
            if(_exclude)
                if (NOT _fname MATCHES ${_exclude})
                    set(folder_files ${folder_files} ${_fname})
                endif ()
            else ()
                set(folder_files ${folder_files} ${_fname})
            endif ()
        endif ()
    endforeach ()

    string(REPLACE "./" "" _folder2 ${_folder})
    string(REPLACE "/" "\\" _folder2 ${_folder2})
    if (_folder2 STREQUAL ".")
        source_group(${_base} FILES ${folder_files})
    else ()
        source_group(${_base}\\${_folder2} FILES ${folder_files})
    endif ()

    set(AUTO_FILES_RESULT ${AUTO_FILES_RESULT} ${folder_files} PARENT_SCOPE)
endfunction ()