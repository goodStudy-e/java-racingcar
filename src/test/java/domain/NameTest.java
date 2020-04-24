package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.InputCarNameException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @DisplayName("Name 객체를 생성한다")
    @Test
    public void testGenerateName() {
        //given
        String carName = "벤츠";

        //when
        Name name = new Name(carName);

        //then
        assertThat(name.getClass()).isEqualTo(Name.class);
        assertThat(name.getName()).isEqualTo(carName);
    }

    @DisplayName("Name이 허용된 최대길이보다 길면 예외를 작성한다")
    @Test
    void testGenerateMaxCarNameLength() {
        //given
        String carName = "abcdef";

        //when //then
        assertThatThrownBy(() -> new Name(carName))
                .isExactlyInstanceOf(InputCarNameException.class);
    }

    @DisplayName("Name이 허용된 최소길이보다 짧으면 예외를 발생한다")
    @Test
    void testGenerateMinCarNameLength() {
        //given
        String carName = "";

        //when //then (생성자를 만드는 순간 바로 예외가 발생해서 따로 분리가 힘듦)
        assertThatThrownBy(() -> new Name(carName))
                .isExactlyInstanceOf(InputCarNameException.class);
    }

    @DisplayName("Name에 공백문자가 포함되면 예외를 발생한다")
    @Test
    void testContainGapChar() {
        //given
        String carName = "car a";

        //when //then (생성자를 만드는 순간 바로 예외가 발생해서 따로 분리가 힘듦)
        assertThatThrownBy(() -> new Name(carName))
                .isExactlyInstanceOf(InputCarNameException.class);
    }



}