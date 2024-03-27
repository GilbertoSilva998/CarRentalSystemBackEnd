package za.ac.cput.factory;
//Sinothando Masiki 219153841


import za.ac.cput.domain.Feedback;
import za.ac.cput.util.Helper;


public class FeedbackFactory {

    // Method to create a feedback object
    public static Feedback createFeedback(String rental,
                                          String customer,
                                          String rating,
                                          String comments,
                                          String feedbackDate) {
        if (Helper.isNullorEmpty(rental) || Helper.isNullorEmpty(customer)){
            return null;
        }

        String feedbackId = Helper.generateId();

        Feedback feedback = new Feedback.Builder().setFeedbackId(feedbackId)
                .setRental(rental)
                .setCustomer(customer)
                .setRating(rating)
                .setComments(comments)
                .setFeedbackDate(feedbackDate)
                .build();
        return feedback;



    }
}

