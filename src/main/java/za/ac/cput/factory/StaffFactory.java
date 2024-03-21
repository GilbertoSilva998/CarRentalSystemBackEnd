package za.ac.cput.factory;

/* StaffFactory.java
Author: Mickley Khoza (219457670)
Date: 21 March 2024
*/


import za.ac.cput.domain.Staff;
import za.ac.cput.util.Helper;

import java.util.List;

public class StaffFactory {

    public static Staff createStaff(String staffId,
                                    String name,
                                    String role,
                                    String contactInfo,
                                    String shiftSchedule) {

        if (Helper.isNullorEmpty(staffId) || Helper.isNullorEmpty(name)) {
            return null;
        }

            return new Staff.Builder()
                    .setStaffId(staffId)
                    .setName(name)
                    .setRole(role)
                    .setContactInfo(contactInfo)
                    .setShiftSchedule(shiftSchedule)
                    .build();


        }
    }

