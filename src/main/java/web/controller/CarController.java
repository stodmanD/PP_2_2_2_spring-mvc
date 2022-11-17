package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {



    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping ()
    public String getCar (@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count ==null) {
            model.addAttribute("countCar", carService.getallCar());
        } else {
            model.addAttribute("countCar", carService.getCarList(count));
        }
        return "Car";

    }
}
