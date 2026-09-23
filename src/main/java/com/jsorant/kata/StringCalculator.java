package com.jsorant.kata;

import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {
  public static String add(String number) {
    if(!number.isBlank()) {
      return Arrays.stream(number.split("[,\\n]"))
        .map(BigDecimal::new)
        .reduce(BigDecimal::add)
        .orElse(new BigDecimal(0))
        .toString();
    }
    return "0";
  }
}
