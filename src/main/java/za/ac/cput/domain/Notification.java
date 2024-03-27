package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Objects;

public class Notification {
    private String notificationId;
    private String message;
    private String sentDate;
    private String isRead;
    private String recipient;


    //Constructopr

    public Notification(String notificationId, String message, String sentDate, boolean isRead, String recipient) {}

    public Notification(Builder builder) {
        this.notificationId = builder.notificationId;
        this.message = builder.message;
        this.sentDate = builder.sentDate;
        this.isRead = builder.isRead;
        this.recipient = builder.recipient;
    }



    // Getters and Setters
    public String getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public String getSentDate() {
        return sentDate;
    }


    public String isRead() {
        return isRead;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification notification = (Notification) o;
        return Objects.equals(notificationId, notification.notificationId)
                && Objects.equals(message, notification.message)
                && Objects.equals(sentDate, notification.sentDate)
                && Objects.equals(isRead, notification.isRead)
                && Objects.equals(recipient, notification.recipient);

    }


    @Override
    public int hashCode() {
        return Objects.hash(notificationId, message, sentDate, isRead, recipient );
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", message='" + message + '\'' +
                ", sentDate=" + sentDate +
                ", isRead=" + isRead +
                ", recipient=" + recipient +
                '}';
    }

    public static class Builder {
        private String notificationId;
        private String message;
        private String sentDate;
        private String isRead;
        private String recipient;

        public Builder setNotificationId(String notificationId) {

            this.notificationId = notificationId;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setSentDate(String sentDate) {
            this.sentDate = sentDate;
            return this;
        }

        public Builder setIsRead(String isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder copy(Notification notification) {
            this.notificationId = notification.notificationId;
            this.message = notification.message;
            this.sentDate = notification.sentDate;
            this.isRead = notification.isRead;
            this.recipient = notification.recipient;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }



    }
}