package za.ac.cput.domain;

/*
 *@author: Philani shange 222790210
 * date: 23 March 2024
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fleet {
    private List<Car> cars;

    public Fleet() {
        this.cars = new ArrayList<>();
    }


    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }


    public void removeCar(Car car) {
        cars.remove(car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fleet fleet = (Fleet) o;
        return Objects.equals(cars, fleet.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}