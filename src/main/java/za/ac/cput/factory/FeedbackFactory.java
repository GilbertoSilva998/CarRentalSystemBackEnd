package za.ac.cput.factory;
//Sinothando Masiki 219153841

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Feedback;

import java.util.Date;

public class FeedbackFactory {

    // Method to create a feedback object
    public static Feedback createFeedback(String feedbackId, String rental, Customer customer, int rating, String comments, Date feedbackDate) {
        // You can add validation logic here before creating the feedback object

        // Create and return a new feedback object
        return new Feedback(feedbackId, rental, customer, rating, comments, feedbackDate);
    }
}

