package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;
    private final CarDao carDao;

    @Autowired
    public CarController(CarService carService, CarDao carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(required = false,defaultValue = "5") int count) {
        List<Car> cars= carDao.getCarList();
        cars = carService.getCarByLimit((long) count, cars);
        model.addAttribute("carsList", cars);
        return "cars";
    }

}