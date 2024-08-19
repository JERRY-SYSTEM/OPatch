package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `lspatch` extension.
 */
@NonNullApi
public class LibrariesForLspatch extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final BeustLibraryAccessors laccForBeustLibraryAccessors = new BeustLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final RaamcostaLibraryAccessors laccForRaamcostaLibraryAccessors = new RaamcostaLibraryAccessors(owner);
    private final RikkaLibraryAccessors laccForRikkaLibraryAccessors = new RikkaLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLspatch(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at beust
     */
    public BeustLibraryAccessors getBeust() {
        return laccForBeustLibraryAccessors;
    }

    /**
     * Returns the group of libraries at commons
     */
    public CommonsLibraryAccessors getCommons() {
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() {
        return laccForGoogleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at raamcosta
     */
    public RaamcostaLibraryAccessors getRaamcosta() {
        return laccForRaamcostaLibraryAccessors;
    }

    /**
     * Returns the group of libraries at rikka
     */
    public RikkaLibraryAccessors getRikka() {
        return laccForRikkaLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxCustomviewLibraryAccessors laccForAndroidxCustomviewLibraryAccessors = new AndroidxCustomviewLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() {
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() {
            return laccForAndroidxComposeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.customview
         */
        public AndroidxCustomviewLibraryAccessors getCustomview() {
            return laccForAndroidxCustomviewLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxNavigationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() {
            return laccForAndroidxRoomLibraryAccessors;
        }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.activity.compose");
        }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeMaterialLibraryAccessors laccForAndroidxComposeMaterialLibraryAccessors = new AndroidxComposeMaterialLibraryAccessors(owner);
        private final AndroidxComposeUiLibraryAccessors laccForAndroidxComposeUiLibraryAccessors = new AndroidxComposeUiLibraryAccessors(owner);

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("androidx.compose.bom");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("androidx.compose.material3");
        }

        /**
         * Returns the group of libraries at androidx.compose.material
         */
        public AndroidxComposeMaterialLibraryAccessors getMaterial() {
            return laccForAndroidxComposeMaterialLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.compose.ui
         */
        public AndroidxComposeUiLibraryAccessors getUi() {
            return laccForAndroidxComposeUiLibraryAccessors;
        }

    }

    public static class AndroidxComposeMaterialLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeMaterialIconsLibraryAccessors laccForAndroidxComposeMaterialIconsLibraryAccessors = new AndroidxComposeMaterialIconsLibraryAccessors(owner);

        public AndroidxComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.compose.material.icons
         */
        public AndroidxComposeMaterialIconsLibraryAccessors getIcons() {
            return laccForAndroidxComposeMaterialIconsLibraryAccessors;
        }

    }

    public static class AndroidxComposeMaterialIconsLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeMaterialIconsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for extended (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtended() {
                return create("androidx.compose.material.icons.extended");
        }

    }

    public static class AndroidxComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeUiToolingLibraryAccessors laccForAndroidxComposeUiToolingLibraryAccessors = new AndroidxComposeUiToolingLibraryAccessors(owner);

        public AndroidxComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.compose.ui");
        }

        /**
         * Returns the group of libraries at androidx.compose.ui.tooling
         */
        public AndroidxComposeUiToolingLibraryAccessors getTooling() {
            return laccForAndroidxComposeUiToolingLibraryAccessors;
        }

    }

    public static class AndroidxComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.compose.ui.tooling");
        }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() {
                return create("androidx.compose.ui.tooling.preview");
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.core.ktx");
        }

    }

    public static class AndroidxCustomviewLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxCustomviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for customview (androidx.customview:customview)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.customview");
        }

            /**
             * Creates a dependency provider for poolingcontainer (androidx.customview:customview-poolingcontainer)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPoolingcontainer() {
                return create("androidx.customview.poolingcontainer");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForAndroidxLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.lifecycle.viewmodel.compose");
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.navigation.compose");
        }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("androidx.room.compiler");
        }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.room.ktx");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.room.runtime");
        }

    }

    public static class BeustLibraryAccessors extends SubDependencyFactory {

        public BeustLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jcommander (com.beust:jcommander)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJcommander() {
                return create("beust.jcommander");
        }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for io (commons-io:commons-io)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIo() {
                return create("commons.io");
        }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleAccompanistLibraryAccessors laccForGoogleAccompanistLibraryAccessors = new GoogleAccompanistLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() {
                return create("google.gson");
        }

        /**
         * Returns the group of libraries at google.accompanist
         */
        public GoogleAccompanistLibraryAccessors getAccompanist() {
            return laccForGoogleAccompanistLibraryAccessors;
        }

    }

    public static class GoogleAccompanistLibraryAccessors extends SubDependencyFactory {
        private final GoogleAccompanistNavigationLibraryAccessors laccForGoogleAccompanistNavigationLibraryAccessors = new GoogleAccompanistNavigationLibraryAccessors(owner);

        public GoogleAccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for pager (com.google.accompanist:accompanist-pager)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPager() {
                return create("google.accompanist.pager");
        }

            /**
             * Creates a dependency provider for swiperefresh (com.google.accompanist:accompanist-swiperefresh)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefresh() {
                return create("google.accompanist.swiperefresh");
        }

        /**
         * Returns the group of libraries at google.accompanist.navigation
         */
        public GoogleAccompanistNavigationLibraryAccessors getNavigation() {
            return laccForGoogleAccompanistNavigationLibraryAccessors;
        }

    }

    public static class GoogleAccompanistNavigationLibraryAccessors extends SubDependencyFactory {

        public GoogleAccompanistNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (com.google.accompanist:accompanist-navigation-animation)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() {
                return create("google.accompanist.navigation.animation");
        }

    }

    public static class RaamcostaLibraryAccessors extends SubDependencyFactory {
        private final RaamcostaComposeLibraryAccessors laccForRaamcostaComposeLibraryAccessors = new RaamcostaComposeLibraryAccessors(owner);

        public RaamcostaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at raamcosta.compose
         */
        public RaamcostaComposeLibraryAccessors getCompose() {
            return laccForRaamcostaComposeLibraryAccessors;
        }

    }

    public static class RaamcostaComposeLibraryAccessors extends SubDependencyFactory {
        private final RaamcostaComposeDestinationsLibraryAccessors laccForRaamcostaComposeDestinationsLibraryAccessors = new RaamcostaComposeDestinationsLibraryAccessors(owner);

        public RaamcostaComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at raamcosta.compose.destinations
         */
        public RaamcostaComposeDestinationsLibraryAccessors getDestinations() {
            return laccForRaamcostaComposeDestinationsLibraryAccessors;
        }

    }

    public static class RaamcostaComposeDestinationsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RaamcostaComposeDestinationsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for destinations (io.github.raamcosta.compose-destinations:core)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("raamcosta.compose.destinations");
        }

            /**
             * Creates a dependency provider for ksp (io.github.raamcosta.compose-destinations:ksp)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKsp() {
                return create("raamcosta.compose.destinations.ksp");
        }

    }

    public static class RikkaLibraryAccessors extends SubDependencyFactory {
        private final RikkaHiddenLibraryAccessors laccForRikkaHiddenLibraryAccessors = new RikkaHiddenLibraryAccessors(owner);
        private final RikkaShizukuLibraryAccessors laccForRikkaShizukuLibraryAccessors = new RikkaShizukuLibraryAccessors(owner);

        public RikkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for refine (dev.rikka.tools.refine:runtime)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRefine() {
                return create("rikka.refine");
        }

        /**
         * Returns the group of libraries at rikka.hidden
         */
        public RikkaHiddenLibraryAccessors getHidden() {
            return laccForRikkaHiddenLibraryAccessors;
        }

        /**
         * Returns the group of libraries at rikka.shizuku
         */
        public RikkaShizukuLibraryAccessors getShizuku() {
            return laccForRikkaShizukuLibraryAccessors;
        }

    }

    public static class RikkaHiddenLibraryAccessors extends SubDependencyFactory {

        public RikkaHiddenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stub (dev.rikka.hidden:stub)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStub() {
                return create("rikka.hidden.stub");
        }

    }

    public static class RikkaShizukuLibraryAccessors extends SubDependencyFactory {

        public RikkaShizukuLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (dev.rikka.shizuku:api)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("rikka.shizuku.api");
        }

            /**
             * Creates a dependency provider for provider (dev.rikka.shizuku:provider)
             * This dependency was declared in catalog lspatch.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProvider() {
                return create("rikka.shizuku.provider");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final BeustVersionAccessors vaccForBeustVersionAccessors = new BeustVersionAccessors(providers, config);
        private final CommonsVersionAccessors vaccForCommonsVersionAccessors = new CommonsVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final GoogleVersionAccessors vaccForGoogleVersionAccessors = new GoogleVersionAccessors(providers, config);
        private final HiddenapiVersionAccessors vaccForHiddenapiVersionAccessors = new HiddenapiVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.27.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: kotlin (1.8.21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ksp (1.8.21-1.0.11)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("ksp"); }

            /**
             * Returns the version associated to this alias: room (2.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: shizuku (13.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getShizuku() { return getVersion("shizuku"); }

        /**
         * Returns the group of versions at versions.beust
         */
        public BeustVersionAccessors getBeust() {
            return vaccForBeustVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.commons
         */
        public CommonsVersionAccessors getCommons() {
            return vaccForCommonsVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.google
         */
        public GoogleVersionAccessors getGoogle() {
            return vaccForGoogleVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.hiddenapi
         */
        public HiddenapiVersionAccessors getHiddenapi() {
            return vaccForHiddenapiVersionAccessors;
        }

    }

    public static class BeustVersionAccessors extends VersionFactory  {

        public BeustVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: beust.jcommander (1.82)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getJcommander() { return getVersion("beust.jcommander"); }

    }

    public static class CommonsVersionAccessors extends VersionFactory  {

        public CommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: commons.io (2.13.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getIo() { return getVersion("commons.io"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.bom (2023.06.01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getBom() { return getVersion("compose.bom"); }

            /**
             * Returns the version associated to this alias: compose.destinations (1.9.42-beta)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getDestinations() { return getVersion("compose.destinations"); }

    }

    public static class GoogleVersionAccessors extends VersionFactory  {

        public GoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: google.gson (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getGson() { return getVersion("google.gson"); }

    }

    public static class HiddenapiVersionAccessors extends VersionFactory  {

        public HiddenapiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: hiddenapi.refine (4.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getRefine() { return getVersion("hiddenapi.refine"); }

            /**
             * Returns the version associated to this alias: hiddenapi.stub (4.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog lspatch.versions.toml
             */
            public Provider<String> getStub() { return getVersion("hiddenapi.stub"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final GooglePluginAccessors paccForGooglePluginAccessors = new GooglePluginAccessors(providers, config);
        private final KotlinPluginAccessors paccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);
        private final RikkaPluginAccessors paccForRikkaPluginAccessors = new RikkaPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.google
         */
        public GooglePluginAccessors getGoogle() {
            return paccForGooglePluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() {
            return paccForKotlinPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.rikka
         */
        public RikkaPluginAccessors getRikka() {
            return paccForRikkaPluginAccessors;
        }

    }

    public static class GooglePluginAccessors extends PluginFactory {
        private final GoogleDevtoolsPluginAccessors paccForGoogleDevtoolsPluginAccessors = new GoogleDevtoolsPluginAccessors(providers, config);

        public GooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.google.devtools
         */
        public GoogleDevtoolsPluginAccessors getDevtools() {
            return paccForGoogleDevtoolsPluginAccessors;
        }

    }

    public static class GoogleDevtoolsPluginAccessors extends PluginFactory {

        public GoogleDevtoolsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for google.devtools.ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog lspatch.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("google.devtools.ksp"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog lspatch.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

    }

    public static class RikkaPluginAccessors extends PluginFactory {
        private final RikkaToolsPluginAccessors paccForRikkaToolsPluginAccessors = new RikkaToolsPluginAccessors(providers, config);

        public RikkaPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.rikka.tools
         */
        public RikkaToolsPluginAccessors getTools() {
            return paccForRikkaToolsPluginAccessors;
        }

    }

    public static class RikkaToolsPluginAccessors extends PluginFactory {

        public RikkaToolsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for rikka.tools.refine to the plugin id 'dev.rikka.tools.refine'
             * This plugin was declared in catalog lspatch.versions.toml
             */
            public Provider<PluginDependency> getRefine() { return createPlugin("rikka.tools.refine"); }

    }

}
