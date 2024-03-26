package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Date;

public class Feedback {
    private String feedbackId;
    private String rental; // Assuming Rental class exists
    private Customer customer; // Assuming Customer class exists
    private int rating;
    private String comments;
    private Date feedbackDate;

    private Feedback(Builder builder) {
        this.feedbackId = builder.feedbackId;
        this.rental = builder.rental;
        this.customer = builder.customer;
        this.rating = builder.rating;
        this.comments = builder.comments;
        this.feedbackDate = builder.feedbackDate;
    }

    // Constructors
    public Feedback() {
        // Default constructor
    }

    public Feedback(String feedbackId, String rental, Customer customer, int rating, String comments, Date feedbackDate) {
        this.feedbackId = feedbackId;
        this.rental = rental;
        this.customer = customer;
        this.rating = rating;
        this.comments = comments;
        this.feedbackDate = feedbackDate;
    }

    // Getters and Setters
    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public static class Builder {
        private final String feedbackId;
        private String rental;
        private Customer customer;
        private int rating;
        private String comments;
        private Date feedbackDate;

        public Builder(String feedbackId) {
            this.feedbackId = feedbackId;
        }

        public Builder rental(String rental) {
            this.rental = rental;
            return this;
        }

        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder feedbackDate(Date feedbackDate) {
            this.feedbackDate = feedbackDate;
            return this;
        }

        public Feedback build() {
            return new Feedback(this);
        }

        // toString method
        @Override
        public String toString() {
            return "Feedback{" +
                    "feedbackId='" + feedbackId + '\'' +
                    ", rental=" + rental +
                    ", customer=" + customer +
                    ", rating=" + rating +
                    ", comments='" + comments + '\'' +
                    ", feedbackDate=" + feedbackDate +
                    '}';
        }

    }

}