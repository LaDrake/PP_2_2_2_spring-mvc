package web.servise;

import web.dao.CarDao;
import web.modul.Car;

import java.util.List;

public class CarService {
    private static CarDao carDao;

    public static List<Car> getAllCar() {
        return CarDao.getAllCar();
    }

    public static List<Car> getCarByCount(List<Car> cars, long count) {
        return CarDao.getCarByCount(cars, count);
    }
}
