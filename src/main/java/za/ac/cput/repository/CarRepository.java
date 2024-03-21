package za.ac.cput.repository;

/*
 * CarRepository.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import za.ac.cput.domain.Car;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository{
    private static CarRepository carRepository = null;
    private List <Car> carList = new ArrayList<>();

    private CarRepository (){carList = new ArrayList<Car>();}

    public static CarRepository getCarRepository(){
        if (carRepository == null) {
            carRepository = new CarRepository();
        }
        return carRepository;
    }

    @Override
    public Car create(Car car) {
        boolean success = carList.add(car);
        if (!success) {
            return null;
        }
        return car;
    }

    @Override
    public Car read(String carID) {
        Car car = carList.stream()
                .filter(s -> s.getCarID().equals(carID))
                .findAny()
                .orElse(null);
        return car;
    }

    @Override
    public Car update(Car car) {
        Car oldCar = read(car.getCarID());
        if (oldCar != null) {
            carList.remove(oldCar);
            carList.add(car);
            return car;
        }
        return null;
    }

    @Override
    public boolean delete(String carID) {
        Car deleteCar = read(carID);
        if (deleteCar == null) {
            carList.remove(null);
            return false;
        }
        return true;
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

}
