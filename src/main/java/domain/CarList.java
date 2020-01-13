package domain;

import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList(String carNames) {
        final String[] carNameArray = carNames.split(",");
        for (String carName : carNameArray) {
            if (carName.length() > 5)
                throw new CarNameLengthException();
            carList.add(new Car(carName));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
