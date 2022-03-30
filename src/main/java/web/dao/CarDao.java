package web.dao;

import model.Car;
import java.util.List;

public interface CarDao {
    void addCar(List<Car> cars, Car car);
    List<Car> getCarList();
    }
