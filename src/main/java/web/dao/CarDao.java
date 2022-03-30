package web.dao;

import model.Car;
import java.util.List;

public interface CarDao {
    List<Car> createCarList();
    void addCar(List<Car> cars, Car car);
}
