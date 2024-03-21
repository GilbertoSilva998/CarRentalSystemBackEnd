package za.ac.cput.factory;

/*
 * CarFactoryTest.Java
 * @author: Gilberto Silva (218239300)
 * Date: 20 March 2024
 * */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Car;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {
    private Car car1;
    private Car car2;
    private Car car3;

    @Test
    public void test(){
        Car car = CarFactory.createCar
                ("Audi",
                 "A4 - 2020",
                 "Black",
                 "CA 98 43 6",
                 "55.000 km",
                 "Available",
                 "R800");

        assert car != null;
        System.out.println(car.toString());
        assertNotNull(car);
    }

    @Test
    void testEquality (){assertEquals(car1, car3);}

    @Test
    void testIdentity (){assertSame(car1, car3);}

    @Test
    void testFail(){assertEquals(car1, car2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){ System.out.println("Time has passed"); }

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}
}