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
   * @someone someone
   * @return Hello, someone!
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
