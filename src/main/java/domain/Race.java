package domain;

import java.util.Random;
import java.util.TimerTask;

public class Race extends TimerTask {

    final private Car[] cars;
    private int runCount;

    private void isGo(Car car) {
        boolean isGo = false;
        Random random = new Random();
        int ranNum = random.nextInt(10);
        if (ranNum > 5)
            isGo = true;

        if (isGo)
            car.setPosition(car.getPosition() + 1);
    }

    private void printRace() {
        for (Car car : cars) {
            StringBuilder sb = new StringBuilder();
            sb.append(car.getName());
            sb.append(" : ");
            for (int i = 0; i < car.getPosition(); i++) {
                sb.append("-");
            }
            System.out.println(sb.toString());
        }
        System.out.println();
    }


    // indent 2 못지킴..
    private void sort() {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getPosition() < cars[j].getPosition()) {
                    Car tempCar = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tempCar;
                }
            }
        }
    }

    private String getWinner() {
        sort();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cars.length - 1; i++) {
            sb.append(cars[i].getName());
            if (cars[i].getPosition() != cars[i + 1].getPosition()) {
                break;
            }
            sb.append(",");
        }
        return sb.toString();
    }


    public Race(String[] nameArray, int runCount) {
        this.cars = new Car[nameArray.length];
        for (int i = 0; i < nameArray.length; i++) {
            cars[i] = new Car(nameArray[i]);
        }
        this.runCount = runCount;
    }

    @Override
    public void run() {
        if (runCount > 0) {
            for (Car car : cars) {
                isGo(car);
            }
            printRace();
            runCount--;
        }
        if (runCount == 0) {
            System.out.print("우승자는 ");
            System.out.println(getWinner());
            cancel();
        }
    }

}
