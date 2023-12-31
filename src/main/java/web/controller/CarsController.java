package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) { this.carService = carService;}

    @GetMapping()
    public String showAll(@RequestParam(value = "count", required =false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCountCars(count));
        return "cars/showAll";
    }
}
