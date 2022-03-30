package web.service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    public List<Car> getCarByLimit (Long limit, List<Car> cars) {
        if (limit >= 5) {
            limit = Long.valueOf(5);
        }
        return cars.stream().limit(limit).toList();
    }


}
