package web.Service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class CarService {
    private static final List<Car> listCars = new ArrayList<>() {{
       add((new Car(1,"mercedes","red")));
            add((new Car(2,"geely","grey")));
            add((new Car(3,"bmw","white")));
            add((new Car(4,"opel","black")));
            add((new Car(5,"renult","blue")));
    }};

    public List<Car> getCars(Integer count) {
        if (Objects.isNull(count)) {
            return new ArrayList<>(listCars);
        }

        if (count < 2) {
            return new ArrayList<>(Collections.emptyList());
        }

        return listCars.stream()
                .limit(count)
                .toList();
    }

    }


