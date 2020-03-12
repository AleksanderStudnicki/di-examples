package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.ImprovedCoffeeMaker;
import com.coffee.inject.workshops.materials.Latte;

public class Task4 {

  /*
   * Your task is to improve code from the previous exercise
   * by adding constructor dependency injection.
   *
   * Do you know why constructor injection is better?
   */
  public static void main(String[] args) {
    ImprovedCoffeeMaker coffeeMaker = new ImprovedCoffeeMaker(new Latte());
    System.out.println(coffeeMaker.brew());
  }
}
