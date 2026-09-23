package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static com.jsorant.kata.StringCalculator.add;
import static org.assertj.core.api.Assertions.assertThat;

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
  void shouldReturnSumWhenAddThreeNumbers() {
    assertThat(add("1,2,3")).isEqualTo("6");
  }
}
