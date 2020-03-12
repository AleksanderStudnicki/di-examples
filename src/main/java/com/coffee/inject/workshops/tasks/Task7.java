package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.ImprovedCoffeeMaker;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Task7 {

  public static void main(String[] args) {
    Injector americanoInjector = Guice.createInjector(new AnotherCofeeModule());
    ImprovedCoffeeMaker americanoMaker = americanoInjector.getInstance(ImprovedCoffeeMaker.class);

    Injector latteInjector = Guice.createInjector(new CoffeeModule());
    ImprovedCoffeeMaker latteMaker = latteInjector.getInstance(ImprovedCoffeeMaker.class);

    System.out.println(latteMaker.brew()); //should print "Here's your Latte"
    System.out.println(americanoMaker.brew()); //should print "Here's your Americano"
  }
}
