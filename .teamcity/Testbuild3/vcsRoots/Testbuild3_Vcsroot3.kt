package Testbuild3.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object Testbuild3_Vcsroot3 : GitVcsRoot({
    uuid = "6ebf3c46-ba32-4243-b7dd-b57b5c80a23a"
    name = "vcsroot3"
    url = "https://github.com/ervirendersingh/jenkins_test_pl.git"
    authMethod = password {
        userName = "ervirendersingh"
        password = "credentialsJSON:44f73074-2a67-4655-a70b-0c4ee693dc22"
    }
})
