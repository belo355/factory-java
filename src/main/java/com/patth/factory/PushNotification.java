package com.patth.factory;

import java.util.logging.Logger;

public class PushNotification implements Notification {

    private static final Logger LOGGER = Logger.getLogger(PushNotification.class.getName() );

    @Override
    public void notifyUser() {
        LOGGER.info("send push notification for user");
    }
}
