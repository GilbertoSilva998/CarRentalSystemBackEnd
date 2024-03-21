package za.ac.cput.domain;

/*
* Car.Java
* @author: Gilberto Silva (218239300)
* Date: 19 March 2024
* */

import java.util.Objects;

public class Car {
    private String carID;
    private String make;
    private String model;
    private String color;
    private String licensePlate;
    private String currentMileage;
    private String rentalStatus;
    private String dailyRentalRate;

    //---------------- Constructor --------------------
    public Car() {}

    public Car(Builder builder) {
        this.carID = builder.carID;
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.licensePlate = builder.licensePlate;
        this.currentMileage = builder.currentMileage;
        this.rentalStatus = builder.rentalStatus;
        this.dailyRentalRate = builder.dailyRentalRate;
    }

    //----------------- Getters -----------------------
    public String getCarID() { return carID; }

    public String getMake() { return make; }

    public String getModel() { return model; }

    public String getColor() { return color; }

    public String getLicensePlate() { return licensePlate; }

    public String getCurrentMileage() { return currentMileage; }

    public String getRentalStatus() { return rentalStatus; }

    public String getDailyRentalRate() { return dailyRentalRate; }

    //------------------ Has Code ---------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carID, car.carID)
                && Objects.equals(make, car.make)
                && Objects.equals(model, car.model)
                && Objects.equals(color, car.color)
                && Objects.equals(licensePlate, car.licensePlate)
                && Objects.equals(currentMileage, car.currentMileage)
                && Objects.equals(rentalStatus, car.rentalStatus)
                && Objects.equals(dailyRentalRate, car.dailyRentalRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, make, model, color, licensePlate, currentMileage, rentalStatus, dailyRentalRate);
    }

    //----------------- To String ----------------------
    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", currentMileage='" + currentMileage + '\'' +
                ", rentalStatus='" + rentalStatus + '\'' +
                ", dailyRentalRate='" + dailyRentalRate + '\'' +
                '}';
    }
    //----------------- Builder ------------------------
    public static class Builder{
        private String carID;
        private String make;
        private String model;
        private String color;
        private String licensePlate;
        private String currentMileage;
        private String rentalStatus;
        private String dailyRentalRate;

        public Builder setCarID(String carID) {
            this.carID = carID;
            return this;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Builder setCurrentMileage(String currentMileage) {
            this.currentMileage = currentMileage;
            return this;
        }

        public Builder setRentalStatus(String rentalStatus) {
            this.rentalStatus = rentalStatus;
            return this;
        }

        public Builder setDailyRentalRate(String dailyRentalRate) {
            this.dailyRentalRate = dailyRentalRate;
            return this;
        }

        public Builder copy(Car car) {
            this.carID = car.carID;
            this.make = car.make;
            this.model = car.model;
            this.color = car.color;
            this.licensePlate = car.licensePlate;
            this.currentMileage = car.currentMileage;
            this.rentalStatus = car.rentalStatus;
            this.dailyRentalRate = car.dailyRentalRate;
            return this;
        }
        public Car build(){ return new Car(this); }

    }
}
