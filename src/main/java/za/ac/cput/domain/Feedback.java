package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Date;

public class Feedback {
        private String feedbackId;
        private Rental rental; // Assuming Rental class exists
        private Customer customer; // Assuming Customer class exists
        private int rating;
        private String comments;
        private Date feedbackDate;

        // Constructors
        public Feedback() {
            // Default constructor
        }

        public Feedback(String feedbackId, Rental rental, Customer customer, int rating, String comments, Date feedbackDate) {
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

        public Rental getRental() {
            return rental;
        }

        public void setRental(Rental rental) {
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

