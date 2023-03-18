// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugin.AGP.application) version Versions.AGP apply false
    id(Plugin.AGP.library) version Versions.AGP apply false
    id(Plugin.Kotlin.android) version Versions.kotlin apply false
    id(Plugin.DaggerHilt.hilt) version Versions.hilt apply false
}