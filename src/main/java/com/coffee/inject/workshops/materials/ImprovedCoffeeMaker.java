package com.coffee.inject.workshops.materials;

public class ImprovedCoffeeMaker {

  //Task 4
  private final Latte coffee;

  // Task 4
  public ImprovedCoffeeMaker(Latte coffee) {
    this.coffee = coffee;
  }

  public String brew() {
    //Task 4 - copy code from class Coffee
    return String.format("Here's your %s!", coffee.getName());
  }
}
