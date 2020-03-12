package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.Coffee;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Task6 {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new CoffeeModule());
    Coffee coffee = injector.getInstance(Coffee.class);
    System.out.println(coffee.getName());
  }
}
