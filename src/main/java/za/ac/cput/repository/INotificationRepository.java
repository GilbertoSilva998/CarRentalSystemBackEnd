package za.ac.cput.repository;

//Sinothando Masiki 219153841

import za.ac.cput.domain.Notification;

import java.util.List;

public interface INotificationRepository {

    /**
     * Saves a notification object to the repository.
     * @param notification The notification object to save.
     * @return true if the notification is saved successfully, false otherwise.
     */
    boolean saveNotification(Notification notification);

    /**
     * Updates an existing notification object in the repository.
     * @param notification The notification object to update.
     * @return true if the notification is updated successfully, false otherwise.
     */
    boolean updateNotification(Notification notification);

    /**
     * Deletes a notification object from the repository based on its ID.
     * @param notificationId The ID of the notification to delete.
     * @return true if the notification is deleted successfully, false otherwise.
     */
    boolean deleteNotification(String notificationId);

    /**
     * Retrieves a notification object from the repository based on its ID.
     * @param notificationId The ID of the notification to retrieve.
     * @return The notification object if found, null otherwise.
     */
    Notification getNotificationById(String notificationId);

    /**
     * Retrieves all notification objects from the repository.
     * @return A list of all notification objects in the repository.
     */
    List<Notification> getAllNotifications();

    /**
     * Retrieves notification objects associated with a specific recipient from the repository.
     * @param recipientId The ID of the recipient (e.g., customer ID).
     * @return A list of notification objects associated with the recipient.
     */
    List<Notification> getNotificationsByRecipientId(String recipientId);
}
