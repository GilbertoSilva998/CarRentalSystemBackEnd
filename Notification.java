package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Date;

public class Notification {

    private String notificationId;
    private String message;
    private Date sentDate;
    private boolean isRead;
    private Customer recipient;

    private Notification(Builder builder) {
        this.notificationId = builder.notificationId;
        this.message = builder.message;
        this.sentDate = builder.sentDate;
        this.isRead = builder.isRead;
        this.recipient = builder.recipient;
    }
    // Constructors

    public Notification(String notificationId, String message, Date sentDate, boolean isRead, Customer recipient) {
        this.notificationId = notificationId;
        this.message = message;
        this.sentDate = sentDate;
        this.isRead = isRead;
        this.recipient = recipient;
    }

    // Getters and Setters
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Customer getRecipient() {
        return recipient;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public static class Builder {
        private final String notificationId;
        private String message;
        private Date sentDate;
        private boolean isRead;
        private Customer recipient;

        public Builder(String notificationId) {
            this.notificationId = notificationId;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder sentDate(Date sentDate) {
            this.sentDate = sentDate;
            return this;
        }

        public Builder isRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder recipient(Customer recipient) {
            this.recipient = recipient;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }

        // toString method
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
    }
}