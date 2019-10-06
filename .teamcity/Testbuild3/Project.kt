package Testbuild3

import Testbuild3.vcsRoots.*
import Testbuild3.vcsRoots.Testbuild3_Vcsroot3
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "fea2a19e-baf9-4c9f-b825-f59804d38722"
    id("Testbuild3")
    parentId("_Root")
    name = "testbuild3"
    description = "descr test build 3"

    vcsRoot(Testbuild3_Vcsroot3)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${Testbuild3_Vcsroot3.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
