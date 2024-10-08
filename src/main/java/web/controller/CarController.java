package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {

        model.addAttribute("list", carService.printCarsByCount(allCars));
        return "car";
    }

}
