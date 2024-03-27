package za.ac.cput.repository;


/* StaffRepository.java
Author: Mickley Khoza (219457670)
Date: 23 March 2024
*/

import za.ac.cput.domain.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository implements IStaffRepository{
    private static StaffRepository staffRepo = null;
    private List<Staff> staffList;

    private StaffRepository() {
        staffList = new ArrayList<>();
    }

    public static StaffRepository getStaffRepository() {
        if (staffRepo == null) {
            staffRepo = new StaffRepository();
        }
        return staffRepo;
    }

    @Override
    public Staff create(Staff staff) {
        boolean success = staffList.add(staff);
        if (!success) {
            return null;
        }
        return staff;
    }

    @Override
    public Staff read(String staffId) {
        for (Staff staff : staffList) {
            if (staff.getStaffId().equals(staffId)) {
                return staff;
            }
        }
        return null;
    }

    @Override
    public Staff update(Staff staff) {
        Staff oldStaff = read(staff.getStaffId());
        if (oldStaff != null) {
            staffList.remove(oldStaff);
            staffList.add(staff);
            return staff;
        }
        return null;
    }

    @Override
    public boolean delete(String staffId) {
        Staff deleteStaff = read(staffId);
        if (deleteStaff != null) {
            staffList.remove(deleteStaff);
            return true;
        }
        return false;
    }

    @Override
    public List<Staff> getAll() {
        return new ArrayList<>(staffList);
    }
}

