package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");

        assertThat(actual).contains("1","2");
    }

    @Test
    void 숫자_하나만을_포함하는지_확인() {
        String[] actual = "1".split(",");

        assertThat(actual).containsExactly("1");
    }

    @Test
    void 괄호_제거하기() {
        String actual = "(1,2)".substring(1, 4);

        assertThat(actual).isEqualTo("1,2");
    }

    @DisplayName("chatAt() 메소드를 활용해 특정 위치의 문자열을 가져오는 테스트")
    @Test
    void CharAt_메소드_학습테스트() {
        char actual = "abc".charAt(1);

        assertThat(actual).isEqualTo('b');
    }

    @DisplayName("인덱스를 벗어났을때, indexoutofbound 예외가 발생하는지 테스트")
    @Test
    void CharAt_메소드_예외테스트() {
        assertThatThrownBy(() -> {
            char actual = "abc".charAt(100);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }



}
