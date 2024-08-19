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
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AgpLibraryAccessors laccForAgpLibraryAccessors = new AgpLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final AppcenterLibraryAccessors laccForAppcenterLibraryAccessors = new AppcenterLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final GlideLibraryAccessors laccForGlideLibraryAccessors = new GlideLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final LibxposedLibraryAccessors laccForLibxposedLibraryAccessors = new LibxposedLibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final RikkaxLibraryAccessors laccForRikkaxLibraryAccessors = new RikkaxLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for appiconloader (me.zhanghai.android.appiconloader:appiconloader)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppiconloader() {
            return create("appiconloader");
    }

        /**
         * Creates a dependency provider for axml (de.upb.cs.swt:axml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAxml() {
            return create("axml");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for hiddenapibypass (org.lsposed.hiddenapibypass:hiddenapibypass)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHiddenapibypass() {
            return create("hiddenapibypass");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

    /**
     * Returns the group of libraries at agp
     */
    public AgpLibraryAccessors getAgp() {
        return laccForAgpLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at appcenter
     */
    public AppcenterLibraryAccessors getAppcenter() {
        return laccForAppcenterLibraryAccessors;
    }

    /**
     * Returns the group of libraries at commons
     */
    public CommonsLibraryAccessors getCommons() {
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at glide
     */
    public GlideLibraryAccessors getGlide() {
        return laccForGlideLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at libxposed
     */
    public LibxposedLibraryAccessors getLibxposed() {
        return laccForLibxposedLibraryAccessors;
    }

    /**
     * Returns the group of libraries at okhttp
     */
    public OkhttpLibraryAccessors getOkhttp() {
        return laccForOkhttpLibraryAccessors;
    }

    /**
     * Returns the group of libraries at rikkax
     */
    public RikkaxLibraryAccessors getRikkax() {
        return laccForRikkaxLibraryAccessors;
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

    public static class AgpLibraryAccessors extends SubDependencyFactory {

        public AgpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for apksig (com.android.tools.build:apksig)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApksig() {
                return create("agp.apksig");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() {
                return create("androidx.activity");
        }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() {
                return create("androidx.annotation");
        }

            /**
             * Creates a dependency provider for browser (androidx.browser:browser)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBrowser() {
                return create("androidx.browser");
        }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() {
                return create("androidx.constraintlayout");
        }

            /**
             * Creates a dependency provider for core (androidx.core:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.core");
        }

            /**
             * Creates a dependency provider for fragment (androidx.fragment:fragment)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFragment() {
                return create("androidx.fragment");
        }

            /**
             * Creates a dependency provider for preference (androidx.preference:preference)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreference() {
                return create("androidx.preference");
        }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() {
                return create("androidx.recyclerview");
        }

            /**
             * Creates a dependency provider for swiperefreshlayout (androidx.swiperefreshlayout:swiperefreshlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefreshlayout() {
                return create("androidx.swiperefreshlayout");
        }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxNavigationLibraryAccessors;
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for fragment (androidx.navigation:navigation-fragment)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFragment() {
                return create("androidx.navigation.fragment");
        }

            /**
             * Creates a dependency provider for ui (androidx.navigation:navigation-ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("androidx.navigation.ui");
        }

    }

    public static class AppcenterLibraryAccessors extends SubDependencyFactory {

        public AppcenterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.microsoft.appcenter:appcenter-analytics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() {
                return create("appcenter.analytics");
        }

            /**
             * Creates a dependency provider for crashes (com.microsoft.appcenter:appcenter-crashes)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrashes() {
                return create("appcenter.crashes");
        }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lang3 (org.apache.commons:commons-lang3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLang3() {
                return create("commons.lang3");
        }

    }

    public static class GlideLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public GlideLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glide (com.github.bumptech.glide:glide)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("glide");
        }

            /**
             * Creates a dependency provider for compiler (com.github.bumptech.glide:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("glide.compiler");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStdlib() {
                return create("kotlin.stdlib");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

    }

    public static class LibxposedLibraryAccessors extends SubDependencyFactory {

        public LibxposedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (io.github.libxposed:api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("libxposed.api");
        }

            /**
             * Creates a dependency provider for interface (io.github.libxposed:interface)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterface() {
                return create("libxposed.interface");
        }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OkhttpLoggingLibraryAccessors laccForOkhttpLoggingLibraryAccessors = new OkhttpLoggingLibraryAccessors(owner);

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("okhttp");
        }

            /**
             * Creates a dependency provider for dnsoverhttps (com.squareup.okhttp3:okhttp-dnsoverhttps)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDnsoverhttps() {
                return create("okhttp.dnsoverhttps");
        }

        /**
         * Returns the group of libraries at okhttp.logging
         */
        public OkhttpLoggingLibraryAccessors getLogging() {
            return laccForOkhttpLoggingLibraryAccessors;
        }

    }

    public static class OkhttpLoggingLibraryAccessors extends SubDependencyFactory {

        public OkhttpLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() {
                return create("okhttp.logging.interceptor");
        }

    }

    public static class RikkaxLibraryAccessors extends SubDependencyFactory {
        private final RikkaxMaterialLibraryAccessors laccForRikkaxMaterialLibraryAccessors = new RikkaxMaterialLibraryAccessors(owner);
        private final RikkaxWidgetLibraryAccessors laccForRikkaxWidgetLibraryAccessors = new RikkaxWidgetLibraryAccessors(owner);

        public RikkaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (dev.rikka.rikkax.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("rikkax.appcompat");
        }

            /**
             * Creates a dependency provider for core (dev.rikka.rikkax.core:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("rikkax.core");
        }

            /**
             * Creates a dependency provider for insets (dev.rikka.rikkax.insets:insets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInsets() {
                return create("rikkax.insets");
        }

            /**
             * Creates a dependency provider for layoutinflater (dev.rikka.rikkax.layoutinflater:layoutinflater)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLayoutinflater() {
                return create("rikkax.layoutinflater");
        }

            /**
             * Creates a dependency provider for parcelablelist (dev.rikka.rikkax.parcelablelist:parcelablelist)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getParcelablelist() {
                return create("rikkax.parcelablelist");
        }

            /**
             * Creates a dependency provider for preference (dev.rikka.rikkax.material:material-preference)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreference() {
                return create("rikkax.preference");
        }

            /**
             * Creates a dependency provider for recyclerview (dev.rikka.rikkax.recyclerview:recyclerview-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() {
                return create("rikkax.recyclerview");
        }

        /**
         * Returns the group of libraries at rikkax.material
         */
        public RikkaxMaterialLibraryAccessors getMaterial() {
            return laccForRikkaxMaterialLibraryAccessors;
        }

        /**
         * Returns the group of libraries at rikkax.widget
         */
        public RikkaxWidgetLibraryAccessors getWidget() {
            return laccForRikkaxWidgetLibraryAccessors;
        }

    }

    public static class RikkaxMaterialLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RikkaxMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (dev.rikka.rikkax.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("rikkax.material");
        }

            /**
             * Creates a dependency provider for preference (dev.rikka.rikkax.material:material-preference)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreference() {
                return create("rikkax.material.preference");
        }

    }

    public static class RikkaxWidgetLibraryAccessors extends SubDependencyFactory {

        public RikkaxWidgetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for borderview (dev.rikka.rikkax.widget:borderview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBorderview() {
                return create("rikkax.widget.borderview");
        }

            /**
             * Creates a dependency provider for mainswitchbar (dev.rikka.rikkax.widget:mainswitchbar)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMainswitchbar() {
                return create("rikkax.widget.mainswitchbar");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: appcenter (5.0.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcenter() { return getVersion("appcenter"); }

            /**
             * Returns the version associated to this alias: glide (4.16.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGlide() { return getVersion("glide"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.22)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: libxposed (100)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLibxposed() { return getVersion("libxposed"); }

            /**
             * Returns the version associated to this alias: nav (2.7.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNav() { return getVersion("nav"); }

            /**
             * Returns the version associated to this alias: okhttp (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AgpPluginAccessors paccForAgpPluginAccessors = new AgpPluginAccessors(providers, config);
        private final LspluginPluginAccessors paccForLspluginPluginAccessors = new LspluginPluginAccessors(providers, config);
        private final NavPluginAccessors paccForNavPluginAccessors = new NavPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for autoresconfig to the plugin id 'dev.rikka.tools.autoresconfig'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAutoresconfig() { return createPlugin("autoresconfig"); }

            /**
             * Creates a plugin provider for kotlin to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlin() { return createPlugin("kotlin"); }

            /**
             * Creates a plugin provider for materialthemebuilder to the plugin id 'dev.rikka.tools.materialthemebuilder'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMaterialthemebuilder() { return createPlugin("materialthemebuilder"); }

        /**
         * Returns the group of plugins at plugins.agp
         */
        public AgpPluginAccessors getAgp() {
            return paccForAgpPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.lsplugin
         */
        public LspluginPluginAccessors getLsplugin() {
            return paccForLspluginPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.nav
         */
        public NavPluginAccessors getNav() {
            return paccForNavPluginAccessors;
        }

    }

    public static class AgpPluginAccessors extends PluginFactory {

        public AgpPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for agp.app to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApp() { return createPlugin("agp.app"); }

            /**
             * Creates a plugin provider for agp.lib to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLib() { return createPlugin("agp.lib"); }

    }

    public static class LspluginPluginAccessors extends PluginFactory {

        public LspluginPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for lsplugin.apksign to the plugin id 'org.lsposed.lsplugin.apksign'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApksign() { return createPlugin("lsplugin.apksign"); }

            /**
             * Creates a plugin provider for lsplugin.cmaker to the plugin id 'org.lsposed.lsplugin.cmaker'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCmaker() { return createPlugin("lsplugin.cmaker"); }

            /**
             * Creates a plugin provider for lsplugin.jgit to the plugin id 'org.lsposed.lsplugin.jgit'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJgit() { return createPlugin("lsplugin.jgit"); }

            /**
             * Creates a plugin provider for lsplugin.resopt to the plugin id 'org.lsposed.lsplugin.resopt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getResopt() { return createPlugin("lsplugin.resopt"); }

    }

    public static class NavPluginAccessors extends PluginFactory {

        public NavPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for nav.safeargs to the plugin id 'androidx.navigation.safeargs'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSafeargs() { return createPlugin("nav.safeargs"); }

    }

}
