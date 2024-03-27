package za.ac.cput.factory;
/* StaffFactoryTest.java
Author: Mickley Khoza (219457670)
Date: 25 March 2024
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import za.ac.cput.domain.Staff;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class StaffFactoryTest {

    private Staff staff1;
    private Staff staff2;
    private Staff staff3;

    @Test
    public void test(){
        Staff staff = StaffFactory.createStaff("S001",
                                               "John Doe",
                                               "Manager",
                                          "john@example.com",
                                         "9:00 AM - 5:00 PM");

        assert staff != null;
        System.out.println(staff.toString());
        assertNotNull(staff);
    }

    @Test
    void testEquality (){assertEquals(staff1, staff3);}

    @Test
    void testIdentity (){assertSame(staff1, staff3);}

    @Test
    void testFail(){assertEquals(staff1, staff2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){ System.out.println("Time has passed"); }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}

}
