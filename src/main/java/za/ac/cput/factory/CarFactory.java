package za.ac.cput.factory;

/*
 * CarFactory.Java
 * @author: Gilberto Silva (218239300)
 * Date: 20 March 2024
 * */

import za.ac.cput.domain.Car;
import za.ac.cput.util.Helper;

public class CarFactory {
    public static Car createCar(String make,
                                String model,
                                String color,
                                String licensePlate,
                                String currentMileage,
                                String rentalStatus,
                                String dailyRentalRate){

        if (Helper.isNullorEmpty(make) || Helper.isNullorEmpty(model)){
            return null;
        }

        String carID = Helper.generateId();

        Car car = new Car.Builder().setCarID(carID)
                .setMake(make)
                .setModel(model)
                .setColor(color)
                .setLicensePlate(licensePlate)
                .setCurrentMileage(currentMileage)
                .setRentalStatus(rentalStatus)
                .setDailyRentalRate(dailyRentalRate)
                .build();
        return car;

    }
}
