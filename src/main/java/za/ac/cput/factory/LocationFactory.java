package za.ac.cput.factory;

/* LocationFactory.java
Author: Mickley Khoza (219457670)
Date: 21 March 2024
*/

import za.ac.cput.domain.Car;
import za.ac.cput.domain.Staff;
import za.ac.cput.domain.Location;
import java.util.List;
import za.ac.cput.util.Helper;
public class LocationFactory {

    public static Location createLocation(String locationId,
                                          String address,
                                          List<Car> availableCars,
                                          List<Staff> staffInfo,
                                          String operatingHours) {

        if (Helper.isNullorEmpty(locationId) || Helper.isNullorEmpty(address) ) {
            return null;
        }

        return new Location.Builder()
                .setLocationId(locationId)
                .setAddress(address)
                .setAvailableCars(availableCars)
                .setStaffInfo(staffInfo)
                .setOperatingHours(operatingHours)
                .build();
    }
}
