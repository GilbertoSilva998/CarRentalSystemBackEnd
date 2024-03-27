package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Insurance;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Insurance.java
 * TDD, Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 25 March 2024.
 */
class InsuranceFactoryTest {
    @Test
    public void createInsurance() {
        Insurance insurance = InsuranceFactory.createInsurance("LC200", "Funeral cover", "355.00");
        System.out.println(insurance.toString());
        assertNotNull(insurance);
        assertEquals("LC200", insurance.getInsuranceID());
    }

}