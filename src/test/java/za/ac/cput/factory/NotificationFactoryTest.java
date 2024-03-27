package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Notification;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
class NotificationFactoryTest {

    private Notification nott;
    private Notification nottt;
    private Notification notttt;

    @Test
    public void test(){
        Notification notification = NotificationFactory.createNotification
                ("Good Service",
                        "11 January 2024",
                        "No",
                        "Zukhanye"
                        );

        assert notification != null;
        System.out.println(notification.toString());
        assertNotNull(notification);
    }

    @Test
    void testEquality (){assertEquals(nott, notttt);}

    @Test
    void testIdentity (){assertSame(nott, nottt);}

    @Test
    void testFail(){assertEquals(nott, nottt);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){ System.out.println("Time has passed"); }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}


    }
