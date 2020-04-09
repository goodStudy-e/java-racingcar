package domain;

import utils.InputTryNumberException;

public class TryNumber {
    private static final int MIN_TRY_NUMBER = 1;
    private static final String INPUT_TRY_NUMBER_MIN_MESSAGE = "최소 시도 횟수는 1회입니다.";

    private final int tryNumber;

    public TryNumber(int tryNumber) {
        isSmallerThanMinTryNumber(tryNumber);
        this.tryNumber = tryNumber;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    private static void isSmallerThanMinTryNumber(int tryNumber) {
        if (tryNumber < MIN_TRY_NUMBER) {
            throw new InputTryNumberException(INPUT_TRY_NUMBER_MIN_MESSAGE);
        }
    }
}
