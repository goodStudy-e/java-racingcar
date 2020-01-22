package domain;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList(String carNames) {
        List<Car> carList = new ArrayList<>();
        final String[] carNameArray = carNames.split(",");
        for (String carName : carNameArray) {
            if (carName.length() > 5) {
                throw new CarNameLengthException();
            }
            carList.add(new Car(carName));
        }
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
