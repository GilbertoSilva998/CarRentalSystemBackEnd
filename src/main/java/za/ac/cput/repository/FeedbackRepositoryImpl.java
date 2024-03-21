package za.ac.cput.repository;

//Sinothando Masiki 219153841


import za.ac.cput.domain.Feedback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackRepositoryImpl implements IFeedbackRepository {
        private Map<String, Feedback> feedbackMap; // Simulating data storage

        public FeedbackRepositoryImpl() {
            this.feedbackMap = new HashMap<>();
        }

        @Override
        public boolean saveFeedback(Feedback feedback) {
            // Logic to save feedback to the data source
            feedbackMap.put(feedback.getFeedbackId(), feedback);
            return true; // Or handle failure cases as needed
        }

        @Override
        public boolean updateFeedback(Feedback feedback) {
            // Logic to update feedback in the data source
            if (feedbackMap.containsKey(feedback.getFeedbackId())) {
                feedbackMap.put(feedback.getFeedbackId(), feedback);
                return true;
            }
            return false; // Feedback not found
        }

        @Override
        public boolean deleteFeedback(String feedbackId) {
            // Logic to delete feedback from the data source
            return feedbackMap.remove(feedbackId) != null;
        }

        @Override
        public Feedback getFeedbackById(String feedbackId) {
            // Logic to retrieve feedback by ID from the data source
            return feedbackMap.get(feedbackId);
        }

        @Override
        public List<Feedback> getAllFeedbacks() {
            // Logic to retrieve all feedbacks from the data source
            return new ArrayList<>(feedbackMap.values());
        }

        @Override
        public List<Feedback> getFeedbacksByCustomerId(String customerId) {
            // Logic to retrieve feedbacks by customer ID from the data source
            List<Feedback> feedbacks = new ArrayList<>();
            for (Feedback feedback : feedbackMap.values()) {
                if (feedback.getCustomer().getCustomerId().equals(customerId)) {
                    feedbacks.add(feedback);
                }
            }
            return feedbacks;
        }
}

