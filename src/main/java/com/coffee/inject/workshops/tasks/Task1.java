package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.CoffeeMaker;

public class Task1 {

  /*
   * Your task is to make code below print "Here's your Latte".
   * You can only modify Coffee class.
   *
   * After that you should try to test Coffee class.
   */
  public static void main(String[] args) {
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    System.out.println(coffeeMaker.brew());
  }
}
