package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDAO carDAO;
    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @Override
    public List<Car> getCountCars(Integer count) {
        return carDAO.getCountCars(count);
    }
}
