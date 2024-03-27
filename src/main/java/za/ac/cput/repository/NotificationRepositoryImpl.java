package za.ac.cput.repository;


//Sinothando Masiki 219153841


import za.ac.cput.domain.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NotificationRepositoryImpl implements INotificationRepository {
        private Map<String, Notification> notificationMap; // Simulating data storage

        public NotificationRepositoryImpl() {
            this.notificationMap = new HashMap<>();
        }

        @Override
        public boolean saveNotification(Notification notification) {
            // Logic to save notification to the data source
            notificationMap.put(notification.getNotificationId(), notification);
            return true; // Or handle failure cases as needed
        }

        @Override
        public boolean updateNotification(Notification notification) {
            // Logic to update notification in the data source
            if (notificationMap.containsKey(notification.getNotificationId())) {
                notificationMap.put(notification.getNotificationId(), notification);
                return true;
            }
            return false; // Notification not found
        }

        @Override
        public boolean deleteNotification(String notificationId) {
            // Logic to delete notification from the data source
            return notificationMap.remove(notificationId) != null;
        }

        @Override
        public Notification getNotificationById(String notificationId) {
            // Logic to retrieve notification by ID from the data source
            return notificationMap.get(notificationId);
        }

        @Override
        public List<Notification> getAllNotifications() {
            // Logic to retrieve all notifications from the data source
            return new ArrayList<>(notificationMap.values());
        }

        @Override
        public List<Notification> getNotificationsByRecipientId(String recipientId) {
            // Logic to retrieve notifications by recipient ID from the data source
            List<Notification> notifications = new ArrayList<>();
//            for (Notification notification : notificationMap.values()) {
//                if (notification.getRecipient().getCustomerId().equals(recipientId)) {
//                    notifications.add(notification);
//                }
//            }
            return notifications;
        }
}
