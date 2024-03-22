package za.ac.cput.repository;
//Sinothando Masiki 219153841

import za.ac.cput.domain.Feedback;

import java.util.List;

public interface IFeedbackRepository {


    // Method to save a feedback object to the repository
    boolean saveFeedback(Feedback feedback);

    // Method to update an existing feedback object in the repository
    boolean updateFeedback(Feedback feedback);

    // Method to delete a feedback object from the repository
    boolean deleteFeedback(String feedbackId);

    // Method to retrieve a feedback object by its ID from the repository
    Feedback getFeedbackById(String feedbackId);

    // Method to retrieve all feedback objects from the repository
    List<Feedback> getAllFeedbacks();

    // Method to retrieve feedback objects by customer ID from the repository
    List<Feedback> getFeedbacksByCustomerId(String customerId);
}
