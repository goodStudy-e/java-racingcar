package domain;

import java.util.Objects;

public class Car {
    private final int STEP_FORWARD_STANDARD = 4;

    private final Name carName;
    private int position = 0;

    public Car(String carName) {
        this.carName = new Name(carName);
    }

    public void goOrStop(int random) {
        if (random >= STEP_FORWARD_STANDARD) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public Name getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}

