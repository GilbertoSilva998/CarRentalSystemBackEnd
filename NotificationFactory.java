package za.ac.cput.factory;

import za.ac.cput.domain.Car;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Notification;
import za.ac.cput.util.Helper;

import java.util.Date;

//Sinothando Masiki 219153841
public class NotificationFactory {

    // Method to create a notification object
    public static Notification createNotification(String notificationId,
                                                  String message,
                                                  String sentDate,
                                                  boolean isRead,
                                                  String recipient) {






        // Create and return a new notification object
        return new Notification(notificationId, message, sentDate, isRead, recipient);
    }


}
