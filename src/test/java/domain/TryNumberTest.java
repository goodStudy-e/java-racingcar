package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.InputTryNumberException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TryNumberTest {

    @DisplayName("TryNumber 객체를 생성한다")
    @Test
    void testGenerateTryNumber() {
        //given
        int number = 1;

        //when
        TryNumber tryNumber = new TryNumber(number);

        //then
        assertThat(tryNumber.getClass()).isEqualTo(TryNumber.class);
        assertThat(tryNumber.getTryNumber()).isEqualTo(number);
    }

    @DisplayName("TryNumber를 최솟값보다 작게 설정하면 예외를 발생한다")
    @Test
    void testTryNumberLowerThanMinTryNumber() {
        //given
        int number = 0;

        //when //then
        assertThatThrownBy(() -> new TryNumber(number))
                .isExactlyInstanceOf(InputTryNumberException.class);


    }
}