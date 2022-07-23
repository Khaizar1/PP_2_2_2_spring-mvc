package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaolmp implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        Car car1 = new Car(1, "Lada", 200);
        Car car2 = new Car(2, "Polo", 300);
        Car car3 = new Car(3, "Mercedes", 500);
        Car car4 = new Car(4, "ВMW", 700);
        Car car5 = new Car(5, "Audi", 400);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int amount) {
        return cars.stream().limit(amount).toList();
    }
}
