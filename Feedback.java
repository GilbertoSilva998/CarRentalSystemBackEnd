package za.ac.cput.domain;
//Sinothando Masiki 219153841

public class Feedback {
    private String feedbackId;
    private String rental; // Assuming Rental class exists
    private String customer; // Assuming Customer class exists
    private String rating;
    private String comments;
    private String feedbackDate;

    private Feedback(Builder builder) {
        this.feedbackId = builder.feedbackId;
        this.rental = builder.rental;
        this.customer = builder.customer;
        this.rating = builder.rating;
        this.comments = builder.comments;
        this.feedbackDate = builder.feedbackDate;
    }

    // Constructors

    public Feedback(String feedbackId, String rental, String customer, String rating, String comments, String feedbackDate) {
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


    public String getRental() {
        return rental;
    }

    public String getCustomer() {
        return customer;
    }


    public String getRating() {
        return rating;
    }

    public String setRating(String number) {
        this.rating = rating;
        return null;
    }


    public String getComments() {
        return comments;
    }


    public String getFeedbackDate() {
        return feedbackDate;
    }



    public static class Builder {
        private final String feedbackId;
        private String rental;
        private String customer;
        private String rating;
        private String comments;
        private String feedbackDate;

        public Builder(String feedbackId) {
            this.feedbackId = feedbackId;
        }

        public Builder rental(String rental) {
            this.rental = rental;
            return this;
        }

        public Builder customer(String customer) {
            this.customer = customer;
            return this;
        }

        public Builder rating(String rating) {
            this.rating = rating;
            return this;
        }

        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder feedbackDate(String feedbackDate) {
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