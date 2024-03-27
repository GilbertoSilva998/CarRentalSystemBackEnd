package za.ac.cput.repository;
import za.ac.cput.domain.Insurance;
import java.util.Set;

/*
 * Insurance.java
 * Interface
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 23 March 2024.
 */

public interface IInsuranceRepository extends IRepository<Insurance, String>{
    public Set<Insurance> getAll();
}
