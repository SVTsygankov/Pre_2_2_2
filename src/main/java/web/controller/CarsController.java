package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDAO;
import web.models.Car;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDAO carDAO;
    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String showAll(@RequestParam(value = "n", required =false) Integer n, Model model) {
        model.addAttribute("cars", carDAO.getNCars(n));
        return "cars/showAll";
    }

    @GetMapping("/new")
    public String newCar(Model model) {
        model.addAttribute("car", new Car());
        return "cars/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("car") Car car) {
        carDAO.save(car);
        return  "redirect:/cars";
    }
}
