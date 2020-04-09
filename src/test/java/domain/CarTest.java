package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.InputCarNameException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @DisplayName("Car 객체가 생성되는지 확인한다.")
    @Test
    public void testGenerateCar() {
        //given
        String carName = "benz";

        //when
        Car car = new Car(carName);

        //then
        assertThat(car.getCarName()).isEqualTo(new Name(carName));
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @DisplayName("이름이 같은 Car는 동일한 것으로 본다.")
    @Test
    void testEqualsToCar() {
        //given
        String carName = "benz";

        //when
        Car car1 = new Car(carName);
        Car car2 = new Car(carName);

        //then
        assertTrue(car1.equals(car2));
    }

    @DisplayName("차량이 전진하는 테스트를 진행한다.")
    @Test
    void testGo() {
        //given
        int randomNumber = 4;
        Car car = new Car("car");

        //when
        car.goOrStop(randomNumber);
        int expectedPosition = 1;

        //then
        assertThat(car.getPosition()).isEqualTo(expectedPosition);
    }

    @DisplayName("차량이 전진하지 않는 테스트를 진행한다.")
    @Test
    void testStop() {
        //given
        int randomNumber = 3;
        Car car = new Car("car");

        //when
        car.goOrStop(randomNumber);
        int expectedPosition = 0;

        //then
        assertThat(car.getPosition()).isEqualTo(expectedPosition);
    }
}