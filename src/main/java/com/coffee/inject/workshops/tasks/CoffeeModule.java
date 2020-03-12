package com.coffee.inject.workshops.tasks;

import com.coffee.inject.workshops.materials.Americano;
import com.coffee.inject.workshops.materials.Coffee;
import com.google.inject.AbstractModule;

public class CoffeeModule extends AbstractModule {
  @Override
  public void configure() {
    bind(Coffee.class).to(Americano.class);
  }
}
