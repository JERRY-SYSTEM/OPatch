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
public class ServicesProjectDependency extends DelegatingProjectDependency {

    @Inject
    public ServicesProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":services:daemon-service"
     */
    public Services_DaemonServiceProjectDependency getDaemonService() { return new Services_DaemonServiceProjectDependency(getFactory(), create(":services:daemon-service")); }

    /**
     * Creates a project dependency on the project at path ":services:manager-service"
     */
    public Services_ManagerServiceProjectDependency getManagerService() { return new Services_ManagerServiceProjectDependency(getFactory(), create(":services:manager-service")); }

    /**
     * Creates a project dependency on the project at path ":services:xposed-service"
     */
    public Services_XposedServiceProjectDependency getXposedService() { return new Services_XposedServiceProjectDependency(getFactory(), create(":services:xposed-service")); }

}
