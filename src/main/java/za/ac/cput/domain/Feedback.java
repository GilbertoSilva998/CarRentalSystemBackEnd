package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Objects;

public class Feedback {

    // Constructors


    // Getters and Setters
    public String getFeedbackId() {

        return feedbackId;
    }

    public String getCustomer() {

        return customer;
    }


    public String getRating() {

        return rating;
    }

    public void setRating(String number) {
        this.rating = rating;
    }


    public String getComments() {
        return comments;
    }


    public String getFeedbackDate() {
        return feedbackDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback feedback)) return false;
        return Objects.equals(getFeedbackId(), feedback.getFeedbackId()) && Objects.equals(getRental(), feedback.getRental()) && Objects.equals(getCustomer(), feedback.getCustomer()) && Objects.equals(getRating(), feedback.getRating()) && Objects.equals(getComments(), feedback.getComments()) && Objects.equals(getFeedbackDate(), feedback.getFeedbackDate());
    }


//hash code
    @Override
    public int hashCode() {
        return Objects.hash(getFeedbackId(), getRental(), getCustomer(), getRating(), getComments(), getFeedbackDate());
    }

    public static class Builder {
        private  String feedbackId;
        private String rental;
        private String customer;
        private String rating;
        private String comments;
        private String feedbackDate;

        public Builder setFeedbackId(String feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        public Builder setRental(String rental) {
            this.rental = rental;
            return this;
        }

        public Builder setCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public Builder setRating(String rating) {
            this.rating = rating;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setFeedbackDate(String feedbackDate) {
            this.feedbackDate = feedbackDate;
            return this;
        }

        public Feedback.Builder copy(Feedback feedback) {
            this.rental = feedback.rental;
            this.customer = feedback.customer;
            this.rating = feedback.rating;
            this.comments = feedback.comments;
            this.feedbackDate = feedback.feedbackDate;
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