package za.ac.cput.repository;


/* ILocationRepository.java
Author: Mickley Khoza (219457670)
Date: 23 March 2024
*/

import java.util.List;
import za.ac.cput.domain.Location;
public interface ILocationRepository {
    Location create(Location location);
    Location read(String locationId);
    Location update(Location location);
    boolean delete(String locationId);
    List<Location> getAll();
}
