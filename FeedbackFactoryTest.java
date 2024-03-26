package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Feedback;
import za.ac.cput.domain.RentalAgreement;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

//Sinothando Masiki 219153841

class FeedbackFactoryTest {

    @Test
    void testFeedbackBuilder() {
        // Create sample objects
        RentalAgreement rental = new RentalAgreement("R001", new Date(), new Date(), "ABC123", 100.0);
        Customer customer = new Customer("C001", "John Doe", "john@example.com");

        // Create a feedback using the builder
        Feedback feedback = new Feedback.Builder("FB001")
                .rental(String.valueOf(rental))
                .customer(customer)
                .rating(4)
                .comments("Great experience!")
                .feedbackDate(new Date())
                .build();

        // Verify attributes using getter methods
        assertEquals("FB001", feedback.getFeedbackId());
        assertEquals(rental, feedback.getRental());
        assertEquals(customer, feedback.getCustomer());
        assertEquals(4, feedback.getRating());
        assertEquals("Great experience!", feedback.getComments());
        assertNotNull(feedback.getFeedbackDate());
    }

    @Test
    public void testFeedbackImmutable() {
        // Create a feedback using the builder
        Feedback feedback = new Feedback.Builder("FB002")
                .rating(5)
                .build();

        // Attempt to modify the feedback object (should not be allowed)
        try {
            feedback.setRating(4); // Assuming there is no setter method for rating
            fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException e) {
            // Expected exception, test passes
        }
    }
}