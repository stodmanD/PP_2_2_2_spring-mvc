package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping ()
    public String getCar (@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count ==null) {
            model.addAttribute("countCar", carDAO.getallCar());
        } else {
            model.addAttribute("countCar", carDAO.getCarList(count));
        }
        return "Car";

    }
}
