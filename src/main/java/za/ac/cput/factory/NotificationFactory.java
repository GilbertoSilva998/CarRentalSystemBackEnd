package za.ac.cput.factory;



import za.ac.cput.domain.Notification;
import za.ac.cput.util.Helper;

import java.util.Date;

//Sinothando Masiki 219153841
public class NotificationFactory {

    // Method to create a notification object
    public static Notification createNotification(String message,
                                                  String sentDate,
                                                  String isRead,
                                                  String recipient) {

        if (Helper.isNullorEmpty(message) || Helper.isNullorEmpty(recipient)){
            return null;
        }

        String notificationId = Helper.generateId();

        Notification notification = new Notification.Builder().setNotificationId(notificationId)
                .setMessage(message)
                .setSentDate(sentDate)
                .setIsRead(isRead)
                .setRecipient(recipient)
                .build();
        return notification;

    }



}
