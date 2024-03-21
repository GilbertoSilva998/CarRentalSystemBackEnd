package za.ac.cput;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Feedback;
import za.ac.cput.domain.Notification;
import za.ac.cput.factory.FeedbackFactory;
import za.ac.cput.factory.NotificationFactory;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Example of using the FeedbackFactory (Sinothando 219153841)

        // Sample data
        String feedbackId = "FB001";
        Rental rental = new Rental(); // Assuming Rental class exists
        Customer customer = new Customer(); // Assuming Customer class exists
        int rating = 4;
        String comments = "Great experience!";
        Date feedbackDate = new Date(); // Current date/time

        // Create a feedback object using the factory method
        Feedback feedback = FeedbackFactory.createFeedback(feedbackId, rental, customer, rating, comments, feedbackDate);

        // Display the created feedback object
        System.out.println("Feedback created: " + feedback);



        // Example of using the NotificationFactory(Sinothando 219153841)
        // Sample data
            String notificationId = "N001";
            String message = "Your rental has been confirmed.";
            Date sentDate = new Date(); // Current date/time
            boolean isRead = false;
            Customer recipient = new Customer(); // Assuming Customer class exists

            // Create a notification object using the factory method
            Notification notification = NotificationFactory.createNotification(notificationId, message, sentDate, isRead, recipient);

            // Display the created notification object
            System.out.println("Notification created: " + notification);

    }
    }
