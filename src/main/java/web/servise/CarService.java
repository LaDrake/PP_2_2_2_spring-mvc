package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> printCarsByCount(long count) {
        List<Car> allCars = carDao.getAllCar();
        if (count >= allCars.size() || count <= 0) {
            return allCars;
        }
        return allCars.stream().limit(count).collect(Collectors.toList());
    }
}

