package com.github.panoscs.apatheiatheme

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class ApatheiaStartupActivity : StartupActivity, DumbAware {
    override fun runActivity(project: Project) {
        val instance = ApatheiaSettings.instance
        if (!instance.state.value) {
            ApatheiaNotification.notifyFirstlyDownloaded(project)
            instance.state.value = true
        }
    }
}