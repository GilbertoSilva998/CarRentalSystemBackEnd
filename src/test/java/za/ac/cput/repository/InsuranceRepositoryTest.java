package za.ac.cput.repository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Insurance;
import za.ac.cput.factory.InsuranceFactory;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Insurance.java
 * TDD, Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 26 March 2024.
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
class InsuranceRepositoryTest {
    private static InsuranceRepository insuranceRepo = InsuranceRepository.getInsuranceRepo();
    private static Insurance insurance = InsuranceFactory.createInsurance("AC278", "Life Insurance", "460.00");


    @Test
    void a_create() {
        Insurance created = insuranceRepo.create(insurance);
        assertEquals(insurance.getInsuranceID(), created.getInsuranceID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Insurance read = insuranceRepo.read(insurance.getInsuranceID());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Insurance updated = new Insurance.Builder().copy(insurance).setCoverageType("Life Cover")
                .build();
        assertNotNull(insuranceRepo.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void e_delete() {
        boolean delete = insuranceRepo.delete(insurance.getInsuranceID());
        assertTrue(delete);
        System.out.println("Deleted:" + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(insuranceRepo.getAll());
        assertNotNull(insuranceRepo.getAll());
    }
}