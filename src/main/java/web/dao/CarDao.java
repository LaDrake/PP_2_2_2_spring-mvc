package web.dao;

import web.modul.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao {
    public static List<Car> getAllCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Red", "BMW"));
        cars.add(new Car(2, "White", "Audi"));
        cars.add(new Car(3, "Blue", "Mercedes"));
        cars.add(new Car(4, "Black", "Toyota"));
        cars.add(new Car(5, "Brown", "Mini"));

        return cars;
    }

    public static List<Car> getCarByCount(List<Car> cars, long count) {
        if (count >= 5 || count <= 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
