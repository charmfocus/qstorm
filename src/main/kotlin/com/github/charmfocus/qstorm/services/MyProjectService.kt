package com.github.charmfocus.qstorm.services

import com.intellij.openapi.project.Project
import com.github.charmfocus.qstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
