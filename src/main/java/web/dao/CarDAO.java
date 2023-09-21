package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Opel", 1));
        cars.add(new Car(++CARS_COUNT, "Opel", 10));
        cars.add(new Car(++CARS_COUNT, "Mercedes", 200));
        cars.add(new Car(++CARS_COUNT, "ВАЗ", 2109));
        cars.add(new Car(++CARS_COUNT, "BMW", 5));

    }

    public List<Car> getNCars(Integer n) {
        if (n == null || n < 0 || n>= 5) { return cars; }
        return cars.subList(0, n);
    }

    public void save(Car car) {
        car.setId(++CARS_COUNT);
        cars.add(car);
    }
}
