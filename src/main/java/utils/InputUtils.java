package utils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    private static Scanner input;
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_CAR_NUMBERS = 2;
    private static final String COMMA = ",";

    public static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        try {
            input = new Scanner(System.in);
            String input = InputUtils.input.nextLine();
            List<String> carNameList = Arrays.asList(input.split(COMMA));

            if (!verifyCarName(carNameList)) {
                throw new InputCarNameException("이름은 1자이상 5자 이하만 가능합니다.");
            }
            if (carNameList.size() < MIN_CAR_NUMBERS) {
                throw new InputCarNameException("최소 2대의 차량이 있어야합니다.");
            }
            return carNameList;
        } catch (InputCarNameException e) {
            return inputCarNames();
        }
    }

    private static boolean verifyCarName(List<String> carList) {
        for (String onecar : carList) {
            if (onecar.length() > MAX_NAME_LENGTH || onecar.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public static int inputTryNumber() {
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            input = new Scanner(System.in);
            int tryNumber = input.nextInt();

            if (tryNumber <= 0) {
                throw new InputTryNumberException();
            }
            return tryNumber;
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요!");
            return inputTryNumber();
        } catch (InputTryNumberException e) {
            System.out.println("0이상의 값을 입력해주세요!");
            return inputTryNumber();
        }
    }
}
