package domain;

import utils.InputCarNameException;

import java.util.Objects;

public class Name {
    private final int MIN_CAR_NAME_LENGTH = 1;
    private final int MAX_CAR_NAME_LENGTH = 5;
    private final String MAX_CAR_NAME_LENGTH_NOTICE = "자동차 이름은 최대 5자까지 가능합니다.";
    private final String MIN_CAR_NAME_LENGTH_NOTICE = "자동차 이름은 최소 1자 이상 작성해야 합니다.";
    private final String CONTAIN_GAP_CHAR_NOTICE = "공백문자는 포함할 수 없습니다.";

    private final String name;

    public Name(String name) {
        isValidateCarName(name);
        this.name = name;
    }

    private void isValidateCarName(String name) {
        isCarNameLengthShorterThanFive(name);
        isCarNameLengthLongerThanZero(name);
        isNameContainGapChar(name);
    }

    private void isCarNameLengthShorterThanFive(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new InputCarNameException(MAX_CAR_NAME_LENGTH_NOTICE);
        }
    }

    private void isCarNameLengthLongerThanZero(String name) {
        if (name.length() < MIN_CAR_NAME_LENGTH) {
            throw new InputCarNameException(MIN_CAR_NAME_LENGTH_NOTICE);
        }
    }

    private void isNameContainGapChar(String name) {
        if (name.contains(" ")) {
            throw new InputCarNameException(CONTAIN_GAP_CHAR_NOTICE);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Name objName = (Name) obj;
        return Objects.equals(name, objName.name);
    }
}
