package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private final List<Car> cars;

    public CarDao() {
        this.cars = new ArrayList<>();
        cars.add(new Car(1, "Red", "BMW"));
        cars.add(new Car(2, "White", "Audi"));
        cars.add(new Car(3, "Blue", "Mercedes"));
        cars.add(new Car(4, "Black", "Toyota"));
        cars.add(new Car(5, "Brown", "Mini"));
    }

    public List<Car> getAllCar() {
        return cars;
    }
}
