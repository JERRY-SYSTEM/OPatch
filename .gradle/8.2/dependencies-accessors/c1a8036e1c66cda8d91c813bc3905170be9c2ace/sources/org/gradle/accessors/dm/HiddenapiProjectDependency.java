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
public class HiddenapiProjectDependency extends DelegatingProjectDependency {

    @Inject
    public HiddenapiProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":hiddenapi:bridge"
     */
    public Hiddenapi_BridgeProjectDependency getBridge() { return new Hiddenapi_BridgeProjectDependency(getFactory(), create(":hiddenapi:bridge")); }

    /**
     * Creates a project dependency on the project at path ":hiddenapi:stubs"
     */
    public Hiddenapi_StubsProjectDependency getStubs() { return new Hiddenapi_StubsProjectDependency(getFactory(), create(":hiddenapi:stubs")); }

}
