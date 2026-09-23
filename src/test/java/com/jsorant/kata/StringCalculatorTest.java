package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
  @Test
  void shouldReturnZeroWhenAddEmptyInput() {
    assertThat(StringCalculator.add("")).isEqualTo("0");
  }

  @Test
  void shouldReturnSameNumberWhenAddSingleNumber() {
    assertThat(StringCalculator.add("1")).isEqualTo("1");
  }

  @Test
  void shouldReturnSumWhenAddTwoNumbers() {
    assertThat(StringCalculator.add("1.1,2.2")).isEqualTo("3.3");
  }
}
