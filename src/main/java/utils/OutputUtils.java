package utils;

import domain.Car;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class OutputUtils {

    public static void printWinner(List<Car> carList, int maxPosition) {
        String winnerCarnames = carList.stream()
                .filter(n -> n.getPosition() == maxPosition)
                .map(Car::getName)
                .sorted()
                .collect(joining(", "));
        System.out.println(winnerCarnames + "가 최종 우승했습니다.");
    }

    public static void printCurrentPosition(List<Car> carList) {
        carList.stream()
                .forEach(car -> System.out.println(car.getName() +
                        ": " + printHyphenPosition(car.getPosition())));
        System.out.println();
    }

    private static String printHyphenPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

}
