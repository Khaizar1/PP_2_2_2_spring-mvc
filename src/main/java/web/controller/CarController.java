package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    private CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") Integer amount, ModelMap model) {
        List<Car> carList = carDao.getCars(amount);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
