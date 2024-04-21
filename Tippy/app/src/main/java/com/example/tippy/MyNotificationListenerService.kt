package com.example.tippy

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class MyNotificationListenerService : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)
        sbn?.let {
            val packageName = sbn.packageName
            val tickerText = sbn.notification.tickerText?.toString()
            Log.d("NotificationListener", "Notification from $packageName: $tickerText")
            // below code to process or analyze the notification
        }
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        super.onNotificationRemoved(sbn)
        // handle when notifications are removed - no need now
    }
}