package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        CarService carService = new CarService();
        model.addAttribute("list", CarService.getCarByCount(CarService.getAllCar(), allCars));
        return "car";
    }

}
