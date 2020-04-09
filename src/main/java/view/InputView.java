package view;

import domain.TryNumber;
import utils.InputTryNumberException;

import java.util.*;

public class InputView {
    private static Scanner input = new Scanner(System.in);
    private static final String INPUT_TRY_NUMBER_ONLY_NUMBER_MESSAGE = "숫자만 입력해주세요!";

    public static String inputCarNames() {
        OutputView.printInputCarNamesMessage();
        return input.nextLine();
    }

    public static TryNumber inputTryNumber() {
        OutputView.printInputTryNumberMessage();
        try {
            return new TryNumber(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println(INPUT_TRY_NUMBER_ONLY_NUMBER_MESSAGE);
            return inputTryNumber();
        } catch (InputTryNumberException e) {
            return inputTryNumber();
        }
    }

}
