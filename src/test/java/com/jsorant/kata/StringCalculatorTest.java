package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static com.jsorant.kata.StringCalculator.add;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {
  @Test
  void shouldReturnZeroWhenAddEmptyInput() {
    assertThat(add("")).isEqualTo("0");
  }

  @Test
  void shouldReturnSameNumberWhenAddSingleNumber() {
    assertThat(add("1")).isEqualTo("1");
  }

  @Test
  void shouldReturnSumWhenAddTwoNumbers() {
    assertThat(add("1.1,2.2")).isEqualTo("3.3");
  }

  @Test
  void shouldReturnSumWhenAddMultipleNumbers() {
    assertThat(add("1,2,3")).isEqualTo("6");
    assertThat(add("1,2\n3")).isEqualTo("6");
  }

  @Test
  void shouldThrowWhenMissingLastNumber() {
    assertThatThrownBy(() -> add("1,3,"))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("Number expected but EOF found");
  }
}
