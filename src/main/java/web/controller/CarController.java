package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public List<Car> getCarByLimit (Long limit, List<Car> cars) {
        if (limit >= 5) {
            limit = Long.valueOf(5);
        }
        return cars.stream().limit(limit).toList();
    }

    @RequestMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(required = false,defaultValue = "5") int count) {
        List<Car> carList =  new ArrayList<>();
        carList.add(0,  new Car("Toyota", 1600, "Red"));
        carList.add(1,  new Car("Toyota", 1600, "Yellow"));
        carList.add(2,  new Car("Toyota", 1800, "Black"));
        carList.add(3,  new Car("Nissan", 2400, "White"));
        carList.add(4,  new Car("Nissan", 1800, "Black"));
        carList.add(5,  new Car("Mitsubishi", 2000, "Green"));

        List<Car> carListLimited =  new ArrayList<>();
        carListLimited = getCarByLimit(Long.valueOf(count), carList);
        model.addAttribute("carsList", carListLimited);
        return "cars";
    }
}