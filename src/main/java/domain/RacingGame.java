package domain;

import java.util.List;


public class RacingGame {

    final List<Car> carList;
    final int track;

    public RacingGame(List<Car> carList, int track) {
        this.carList = carList;
        this.track = track;
    }

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

    private boolean isSatisfied(int number) {
        return number >= 4;
    }

    private void race(Car car) {
        final int positionByOneRacing = 1;
        if (isSatisfied(new RandomNumberGenerator().getRandomNumber())) {
            car.positionUp(positionByOneRacing);
        }
    }

    private void raceList() {
        int carListSize = carList.size();
        for (int i = 0; i < carListSize; i++) {
            race(carList.get(i));
        }
    }

    private boolean confirm(Car car) {
        return car.getPosition() >= track;
    }

    private boolean confirmRacing() {
        int carListSize = carList.size();
        for (int i = 0; i < carListSize; i++) {
            Car car = carList.get(i);
            if (confirm(car)) {
                return true;
            }
        }
        return false;
    }

    private String getSamePositionWithWinner(Car winnerCar, Car anotherCar) {
        StringBuilder sb = new StringBuilder();
        if (anotherCar.getPosition() == winnerCar.getPosition()) {
            sb.append(", " + anotherCar.getName());
        }
        return sb.toString();
    }

    private void printWinner() {
        StringBuilder sb = new StringBuilder();
        int carListSize = carList.size();
        carList.sort((car1, car2) -> {
            int position1 = car1.getPosition();
            int position2 = car2.getPosition();
            if (position1 == position2) {
                return 0;
            } else if (position1 < position2) {
                return 1;
            } else {
                return -1;
            }
        });
        Car winnerCar = carList.get(0);
        sb.append("우승자는 : ");
        sb.append(winnerCar.getName());
        for (int i = 1; i < carListSize; i++) {
            Car car = carList.get(i);
            sb.append(getSamePositionWithWinner(winnerCar, car));
        }
        System.out.println(sb.toString());
    }

    public void run() {
        boolean isEnd = false;
        while (!isEnd) {
            raceList();
            printRacing();
            isEnd = confirmRacing();
        }
        printWinner();
    }
}
