package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Feedback;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

//Sinothando Masiki 219153841

class FeedbackFactoryTest {
    private  Feedback feed1;
    private Feedback feed2;
    private Feedback feed3;

    @Test

    void test(){
        Feedback feedback = FeedbackFactory.createFeedback
                ("Adam Smith",
                        "Azola M",
                        "5",
                        "Excellent",
                        "02 March 2024");

        System.out.println(feedback.toString());
        assertNotNull(feedback);

    }

    @Test
    void testEquality (){assertEquals(feed1, feed2);}

    @Test
    void testIdentity (){assertSame(feed1, feed3);}

    @Test
    void testFail(){assertEquals(feed1, feed2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){ System.out.println("Time has passed"); }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}


}