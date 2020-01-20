package domain;

import utils.InputUtils;
import utils.OutputUtils;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class RacingGameSystem {
    private List<Car> carList;

    public void play() {
        List<String> carNames = InputUtils.inputCarNames();
        carList = carNames.stream()
                .map(n -> new Car(n))
                .collect(toList());

        int try_number = InputUtils.inputTryNumber();
        for (int i = 0; i < try_number; i++) {
            playOneTime();
            OutputUtils.printCurrentPosition(carList);
        }
        OutputUtils.printWinner(carList, getMaxPosition());
    }

    private void playOneTime() {
        for (Car car : carList) {
            if ((int) (Math.random() * 10) >= 4) {
                car.moveOneStep();
            }
        }
    }

    private int getMaxPosition() {
        return carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();
    }

}