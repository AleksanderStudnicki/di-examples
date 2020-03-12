package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.CoffeeMaker;
import com.coffee.inject.workshops.materials.Latte;

public class Task3 {

  /*
   * Your task is to improve code from the previous exercise
   * by adding setter dependency injection.
   *
   * Can you test it now?
   */
  public static void main(String[] args) {
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    coffeeMaker.setCoffee(new Latte());
    System.out.println(coffeeMaker.brew());
  }
}
