package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  @author james
  @param someone String
  @return greeting String
  comentario
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
