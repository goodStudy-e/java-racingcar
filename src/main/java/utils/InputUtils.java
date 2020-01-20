package utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int MAX_NAME_LENGTH = 5;

    public static List<String> inputCarNames() {
        while (true) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String input = INPUT.nextLine();
            List<String> list = Arrays.asList(input.split(","));
            if (list.size() > 0 && verifyCarName(list)) {
                return list;
            }
            System.out.println("입력 형식이 옳지 않습니다.");
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
        while (true) {
            System.out.println("시도할 횟수는 몇회인가요?");
            try {
                int tryNumber = INPUT.nextInt();
                if (tryNumber > 0) {
                    return tryNumber;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
            }
        }
    }

}
