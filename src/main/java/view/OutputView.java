package view;

import domain.Car;

import java.util.List;

public class OutputView {
    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_NUMBER_MESSAGE = "시도할 횟수는 몇회인가요?";
    private static final String FINAL_WINNER_MESSAGE = "가 최종 우승했습니다. ";
    private static final String RUN_RESULT_MESSAGE = "실행 결과 ";

    public static void printCurrentPosition(List<Car> carList) {
        carList.forEach(OutputView::printCar);
        System.out.println();
    }

    private static void printCar(Car car) {
        System.out.println(car.getCarName().getName() +
                ": " + printHyphenPosition(car.getPosition()));
    }

    private static String printHyphenPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public static void printRunResult() {
        System.out.println(RUN_RESULT_MESSAGE);
    }

    public static void printInputCarNamesMessage() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
    }

    public static void printInputTryNumberMessage() {
        System.out.println(INPUT_TRY_NUMBER_MESSAGE);
    }

    public static void printWinners(String winners) {
        System.out.println(winners + FINAL_WINNER_MESSAGE);
    }


}
