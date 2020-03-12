package com.coffee.inject.workshops.materials;

public class CoffeeMaker {

  //Task 1
  private Latte coffee = new Latte();

  public String brew() {
    //Task 1
    return String.format("Here's your %s!", coffee.getName());
  }

  //Task 3
  public void setCoffee(Latte coffee) {
    this.coffee = coffee;
  }
}
