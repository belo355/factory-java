package com.patth.factory.app;

import java.util.logging.Logger;

public class SMSNotification implements Notification {

    private static final Logger LOGGER = Logger.getLogger(SMSNotification.class.getName() );

    @Override
    public void notifyUser() {
        LOGGER.info("send sms message for user");
    }
}
