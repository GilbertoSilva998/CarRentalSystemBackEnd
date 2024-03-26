package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Notification;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class NotificationFactoryTest {

    @Test
    void createNotification() {
        String notificationId = "N001";
        String message = "Your rental has been confirmed.";
        String sentDate = String.valueOf(new Date()); // Current date/time
        boolean isRead = false;
        String recipient = String.valueOf(new Customer("C001", "John Doe", "john@example.com")); // Sample recipient

        // Create a notification using the factory method
        Notification notification = NotificationFactory.createNotification(notificationId, message, sentDate, isRead, recipient);

        // Check if the notification object is created successfully
        assertNotNull(notification);
        assertEquals(notificationId, notification.getNotificationId());
        assertEquals(message, notification.getMessage());
        assertEquals(sentDate, notification.getSentDate());
        assertEquals(isRead, notification.isRead());
        assertEquals(recipient, notification.getRecipient());
    }
    }
