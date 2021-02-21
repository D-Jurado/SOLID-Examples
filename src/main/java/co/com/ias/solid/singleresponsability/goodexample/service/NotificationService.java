package co.com.ias.solid.singleresponsability.goodexample.service;

import co.com.ias.solid.singleresponsability.goodexample.domain.User;
import lombok.NoArgsConstructor;

import java.util.logging.Logger;

@NoArgsConstructor
public class NotificationService {

    private static final Logger logger = Logger.getLogger(NotificationService.class.getName());

    public void sendEmailNotification(String message, User user){
        //logic to send an email notification
        logger.info(String.format("Message: %s\nSent to: %s\nUser name: %s",
                message,
                user.getEmail(),
                user.getName()));
    }

    public void sendSMSNotification(String message, User user){
        //Logic to send a SMS notification
        logger.info(String.format("Message: %s\nSent to: %s\nUser name: %s",
                message,
                user.getPhoneNumber(),
                user.getName()));
    }
}
