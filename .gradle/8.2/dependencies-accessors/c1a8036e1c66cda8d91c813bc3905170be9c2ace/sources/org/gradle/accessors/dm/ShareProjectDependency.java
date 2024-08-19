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
public class ShareProjectDependency extends DelegatingProjectDependency {

    @Inject
    public ShareProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":share:android"
     */
    public Share_AndroidProjectDependency getAndroid() { return new Share_AndroidProjectDependency(getFactory(), create(":share:android")); }

    /**
     * Creates a project dependency on the project at path ":share:java"
     */
    public Share_JavaProjectDependency getJava() { return new Share_JavaProjectDependency(getFactory(), create(":share:java")); }

}
