package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Notification;

import java.util.Date;

//Sinothando Masiki 219153841
public class NotificationFactory {

    // Method to create a notification object
    public static Notification createNotification(String notificationId, String message, Date sentDate, boolean isRead, Customer recipient) {
        // You can add validation logic here before creating the notification object

        // Create and return a new notification object
        return new Notification(notificationId, message, sentDate, isRead, recipient);
    }


}
