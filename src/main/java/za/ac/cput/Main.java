package za.ac.cput;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Feedback;
import za.ac.cput.domain.Notification;
import za.ac.cput.domain.RentalAgreement;

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

            Feedback feedback = new Feedback.Builder("FB001")
                    .rental(String.valueOf(new RentalAgreement()))
                    .customer(String.valueOf(new Customer("C001", "John Doe", "john@example.com")))
                    .rating(String.valueOf(5))
                    .comments("Excellent service!")
                    .feedbackDate(String.valueOf(new Date()))
                    .build();




            //For Notification
        Customer recipient = new Customer("C001", "John Doe", "john@example.com"); // Sample recipient

        Notification notification = new Notification.Builder("N001")
                .message("Your rental has been confirmed.")
                .sentDate(String.valueOf(new Date()))
                .isRead(false)
                .recipient(String.valueOf(recipient))
                .build();

        // Use the constructed notification object as needed
        System.out.println("Notification created: " + notification);
    }


    }

