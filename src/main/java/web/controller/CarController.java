package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carService;
    private CarDaoImpl carDao;


    @Autowired
    public CarController(CarServiceImpl carService, CarDaoImpl carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(required = false,defaultValue = "5") int count) {
        List<Car> cars= carDao.createCarList();
        Car car1 = new Car("Toyota", 1600, "Red");
        Car car2 = new Car("Toyota", 1600, "Yellow");
        Car car3 = new Car("Toyota", 1800, "Black");
        Car car4 = new Car("Nissan", 2400, "White");
        Car car5 = new Car("Nissan", 1800, "Black");
        Car car6 = new Car("Mitsubishi", 2000, "Green");
        carDao.addCar(cars,car1);
        carDao.addCar(cars,car2);
        carDao.addCar(cars,car3);
        carDao.addCar(cars,car4);
        carDao.addCar(cars,car5);
        carDao.addCar(cars,car6);

        cars = carService.getCarByLimit(Long.valueOf(count), cars);
        model.addAttribute("carsList", cars);
        return "cars";
    }

}