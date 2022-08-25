package com.github.panoscs.apatheiatheme

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationListener
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import org.intellij.lang.annotations.Language

object ApatheiaNotification {

    @Language("HTML")
    private val footer = """
        <p>I hope you like it! ❤</p>
        <br>
        <p>
            <a href="https://github.com/PanosCS/ApatheiaTheme">GitHub</a>
        </p>
    """.trimIndent()

    private val welcomeMessage = """
        <div>
            $footer
        </div>
    """.trimIndent()

    fun notifyFirstlyDownloaded(project: Project) {
        val title = "Apatheia Theme is installed"

        val notification =
            NotificationGroupManager.getInstance()
                .getNotificationGroup("Apatheia Notification Group")
                .createNotification(
                    title,
                    welcomeMessage,
                    NotificationType.INFORMATION,
                )
        notification.setListener(NotificationListener.URL_OPENING_LISTENER)
        notification.notify(project)
    }
}