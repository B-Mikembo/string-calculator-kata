package com.jsorant.kata;

public class StringCalculator {
  public static String add(String numbers) {
    if(!numbers.isBlank()) return numbers;
    return "0";
  }
}
