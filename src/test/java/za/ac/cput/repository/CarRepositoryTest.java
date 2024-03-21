package za.ac.cput.repository;

/*
 * CarRepositoryTest.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CarRepositoryTest {

    private static final CarRepository carRepo = CarRepository.getCarRepository();

    private static final Car car = CarFactory.createCar(
            "Porsche",
            "911 - 2021",
            "Yellow",
            "CA 001",
            "25 000 km",
            "Available",
            "R4000");

    @Test
    void a_create() {
        Car created = carRepo.create(car);
        assert car != null;
        assertEquals(car.getCarID(), created.getCarID());
        System.out.println("Created " + created);
    }

    @Test
    void b_read() {
        assert car != null;
        Car read = carRepo.read(car.getCarID());
        assertNotNull(read);
        System.out.println("Read " + read);
    }

    @Test
    void c_update() {
        assert car != null;
        Car updated = new Car.Builder().copy(car)
                .setMake("Jaguar")
                .setModel("XF - 2021")
                .setColor("Red")
                .setLicensePlate("CA 0002")
                .setCurrentMileage("30 000 km")
                .setRentalStatus("Reserved")
                .setDailyRentalRate("R3000")
                .build();
        assertNotNull(carRepo.update(updated));
        System.out.println("Updated " + updated);
    }

    @Test
    void e_delete() {
        assert car != null;
        boolean deleted = carRepo.delete(car.getCarID());
        assertTrue(deleted);
        System.out.println("Deleted " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(carRepo.getAll());
    }
}