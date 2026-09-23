package com.jsorant.kata;

import java.math.BigDecimal;

public class StringCalculator {
  public static String add(String number) {
    if(!number.isBlank()) {
      if(number.contains(",")) {
        var numbers = number.split(",");
        return String.valueOf(new BigDecimal(numbers[0]).add(new BigDecimal(numbers[1])));
      }
      return number;
    }
    return "0";
  }
}
