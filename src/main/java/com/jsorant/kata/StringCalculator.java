package com.jsorant.kata;

import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {
  public static String add(String number) {
    if(!number.isBlank()) {
      var regex = "[,\\n]";
      if(number.matches(".*" + regex + "$"))
        throw new IllegalArgumentException("Number expected but EOF found");
      return Arrays.stream(number.split(regex))
        .map(BigDecimal::new)
        .reduce(BigDecimal::add)
        .orElse(new BigDecimal(0))
        .toString();
    }
    return "0";
  }
}
