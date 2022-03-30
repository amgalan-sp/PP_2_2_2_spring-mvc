package web.dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        return carList;
    }

    @Override
    public void addCar(List<Car> cars, Car car) {
        cars.add(car);
    }
}
