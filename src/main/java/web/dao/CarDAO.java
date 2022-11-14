package web.dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        Car car1 = new Car("BMW", "X5", "red");
        Car car2 = new Car("AUDI", "A8", "black");
        Car car3 = new Car("VOLVO", "X15", "blue");
        Car car4 = new Car("RENAULT", "KOLEOS", "White");
        Car car5 = new Car("LADA", "GRANDA", "red");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }
    public List<Car> getallCar() {
        return carList;
    }
    public List<Car> getCarList(int number) {
        if (number>=5) {
            return carList;
        } else {return carList.stream().limit(number).collect(Collectors.toList());}

    }
}
