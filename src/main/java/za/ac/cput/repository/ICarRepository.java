package za.ac.cput.repository;

/*
 * ICarRepository.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import za.ac.cput.domain.Car;
import java.util.List;

public interface ICarRepository extends IRepository<Car, String> {
    public List<Car> getAll();
}
