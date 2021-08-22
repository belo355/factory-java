package com.patth.factory;

import java.util.logging.Logger;

public class EmailNotification implements Notification {

    private static final Logger LOGGER = Logger.getLogger(EmailNotification.class.getName() );

    @Override
    public void notifyUser() {
        LOGGER.info("sendo email to user");
    }
}
