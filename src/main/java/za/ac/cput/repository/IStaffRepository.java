package za.ac.cput.repository;

/* IStaffRepository.java
Author: Mickley Khoza (219457670)
Date: 23 March 2024
*/

import za.ac.cput.domain.Staff;
import java.util.List;

public interface IStaffRepository {
    Staff create(Staff staff);
    Staff read(String staffId);
    Staff update(Staff staff);
    boolean delete(String staffId);
    List<Staff> getAll();
}
