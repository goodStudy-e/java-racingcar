package domain;

import java.util.List;

public class RacingGame {

    final List<Car> carList;

    public RacingGame(List<Car> carList) {
        this.carList = carList;
    }

    // 이름
    private void printCar(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName());
        sb.append(" : ");
        final int carPosition = car.getPosition();
        for (int i = 0; i < carPosition; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString());
    }

    public void printRacing() {
        final int carListSize = carList.size();
        for (int i = 0; i < carListSize; i++) {
            printCar(carList.get(i));
        }
        System.out.println();
    }
}
