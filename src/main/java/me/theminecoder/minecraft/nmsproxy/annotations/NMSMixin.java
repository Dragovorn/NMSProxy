package me.theminecoder.minecraft.nmsproxy.annotations;

/**
 * @author theminecoder
 */
public @interface NMSMixin {

    enum Action {
        PREPEND,
        REPLACE,
        APPEND
    }

    Action value();

    NMSVersionName[] versionNames() default {};

}
