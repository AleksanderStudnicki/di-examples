package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.ImprovedCoffeeMaker;
import com.coffee.inject.workshops.materials.Latte;

public class Task5 {

  /*
   * There is dependency inversion missing here. Can you apply it?
   */
  public static void main(String[] args) {
    ImprovedCoffeeMaker coffeeMaker = new ImprovedCoffeeMaker(new Latte());
    System.out.println(coffeeMaker.brew());
  }
}
