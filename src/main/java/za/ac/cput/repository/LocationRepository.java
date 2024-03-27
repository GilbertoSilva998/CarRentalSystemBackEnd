package za.ac.cput.repository;


/* LocationRepository.java
Author: Mickley Khoza (219457670)
Date: 23 March 2024
*/

import za.ac.cput.domain.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationRepository implements ILocationRepository {

        private static LocationRepository locationRepo = null;
        private List<Location> locationList = new ArrayList<>();

    private LocationRepository() {
            locationList = new ArrayList<>();
        }

        public static LocationRepository getLocationRepository() {
            if (locationRepo == null) {
                locationRepo = new LocationRepository();
            }
            return locationRepo;
        }

        @Override
        public Location create(Location location) {
            boolean success = locationList.add(location);
            if (!success) {
                return null;
            }
            return location;
        }

        @Override
        public Location read(String locationId) {
            for (Location location : locationList) {
                if (location.getLocationId().equals(locationId)) {
                    return location;
                }
            }
            return null;
        }

        @Override
        public Location update(Location location) {
            Location oldLocation = read(location.getLocationId());
            if (oldLocation != null) {
                locationList.remove(oldLocation);
                locationList.add(location);
                return location;
            }
            return null;
        }

        @Override
        public boolean delete(String locationId) {
            Location deleteLocation = read(locationId);
            if (deleteLocation != null) {
                locationList.remove(deleteLocation);
                return true;
            }
            return false;
        }

        @Override
        public List<Location> getAll() {
            return locationList;
        }
}
