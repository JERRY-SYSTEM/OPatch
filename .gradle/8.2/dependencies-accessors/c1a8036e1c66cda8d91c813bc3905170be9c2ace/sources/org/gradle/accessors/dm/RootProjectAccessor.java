package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class RootProjectAccessor extends TypeSafeProjectDependencyFactory {


    @Inject
    public RootProjectAccessor(DefaultProjectDependencyFactory factory, ProjectFinder finder) {
        super(factory, finder);
    }

    /**
     * Creates a project dependency on the project at path ":"
     */
    public LSPatchProjectDependency getLSPatch() { return new LSPatchProjectDependency(getFactory(), create(":")); }

    /**
     * Creates a project dependency on the project at path ":apkzlib"
     */
    public ApkzlibProjectDependency getApkzlib() { return new ApkzlibProjectDependency(getFactory(), create(":apkzlib")); }

    /**
     * Creates a project dependency on the project at path ":core"
     */
    public CoreProjectDependency getCore() { return new CoreProjectDependency(getFactory(), create(":core")); }

    /**
     * Creates a project dependency on the project at path ":hiddenapi"
     */
    public HiddenapiProjectDependency getHiddenapi() { return new HiddenapiProjectDependency(getFactory(), create(":hiddenapi")); }

    /**
     * Creates a project dependency on the project at path ":jar"
     */
    public JarProjectDependency getJar() { return new JarProjectDependency(getFactory(), create(":jar")); }

    /**
     * Creates a project dependency on the project at path ":manager"
     */
    public ManagerProjectDependency getManager() { return new ManagerProjectDependency(getFactory(), create(":manager")); }

    /**
     * Creates a project dependency on the project at path ":meta-loader"
     */
    public MetaLoaderProjectDependency getMetaLoader() { return new MetaLoaderProjectDependency(getFactory(), create(":meta-loader")); }

    /**
     * Creates a project dependency on the project at path ":patch"
     */
    public PatchProjectDependency getPatch() { return new PatchProjectDependency(getFactory(), create(":patch")); }

    /**
     * Creates a project dependency on the project at path ":patch-loader"
     */
    public PatchLoaderProjectDependency getPatchLoader() { return new PatchLoaderProjectDependency(getFactory(), create(":patch-loader")); }

    /**
     * Creates a project dependency on the project at path ":services"
     */
    public ServicesProjectDependency getServices() { return new ServicesProjectDependency(getFactory(), create(":services")); }

    /**
     * Creates a project dependency on the project at path ":share"
     */
    public ShareProjectDependency getShare() { return new ShareProjectDependency(getFactory(), create(":share")); }

}
