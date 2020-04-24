package Controller;

import domain.Car;
import domain.Name;
import domain.TryNumber;
import utils.InputCarNameException;
import view.InputView;
import view.OutputView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingGameSystem {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MIN_CAR_NUMBERS = 2;
    private static final String CAR_NUMBER_MIN_MESSAGE = "최소 2대의 차량이 있어야합니다.";
    private static final String CAR_NAME_DUPLICATED_MESSAGE = "차량의 이름은 중복되면 안됩니다.";
    private static final String COMMA = ",";

    private List<Car> cars;
    private TryNumber tryNumber;

    public void generateCars() {
        String carNames = InputView.inputCarNames();
        try {
            cars = splitCarNames(carNames).stream()
                    .map(String::trim)
                    .map(Car::new)
                    .collect(Collectors.toList());

            isValidateCars(cars);

        } catch (InputCarNameException e) {
            generateCars();
        }
    }

    private List<String> splitCarNames(String carNames) {
        return Arrays.asList(carNames.split(COMMA));
    }

    private static void isValidateCars(List<Car> carList) {
        isNotDuplicatedCarName(carList);
        isCarNumberSmallerThanTwo(carList);
    }

    private static void isNotDuplicatedCarName(List<Car> carList) {
        Set<Car> carSet = new HashSet<>(carList);
        if (carList.size() != carSet.size()) {
            throw new InputCarNameException(CAR_NAME_DUPLICATED_MESSAGE);
        }
    }

    private static void isCarNumberSmallerThanTwo(List<Car> carList) {
        if (carList.size() < MIN_CAR_NUMBERS) {
            throw new InputCarNameException(CAR_NUMBER_MIN_MESSAGE);
        }
    }

    public void play() {
        tryNumber = InputView.inputTryNumber();
        OutputView.printRunResult();
        for (int i = 0; i < tryNumber.getTryNumber(); i++) {
            playOneTime(cars);
            OutputView.printCurrentPosition(cars);
        }
    }

    private void playOneTime(List<Car> cars) {
        for (Car car : cars) {
            car.goOrStop(generateRandomNumber());
        }
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * MAX_RANDOM_NUMBER);
    }

    public void noticeWinner() {
        String winners = cars.stream()
                .filter(car -> car.getPosition() == getMaxPosition())
                .map(Car::getCarName)
                .map(Name::getName)
                .sorted()
                .collect(Collectors.joining(", "));
        OutputView.printWinners(winners);
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();
    }

}