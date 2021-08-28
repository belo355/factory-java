package com.patth.factory.app;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "MAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                return null;
        }
    }
}
