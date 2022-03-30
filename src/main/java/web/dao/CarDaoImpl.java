package web.dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {

    @Override
    public void addCar(List<Car> cars, Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        addCar(cars,new Car("Toyota", 1600, "Red"));
        addCar(cars,new Car("Toyota", 1600, "Yellow"));
        addCar(cars,new Car("Toyota", 1800, "Black"));
        addCar(cars,new Car("Nissan", 2400, "White"));
        addCar(cars,new Car("Nissan", 1800, "Black"));
        addCar(cars,new Car("Mitsubishi", 2000, "Green"));
        return cars;
    }
}
