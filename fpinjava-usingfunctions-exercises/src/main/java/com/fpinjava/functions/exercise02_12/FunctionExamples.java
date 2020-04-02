package com.fpinjava.functions.exercise02_12;

public class FunctionExamples {

  /*
   * Note: The same implementation may be used for all four cases.
   */

  //static reference to the function...FunctionExamples.xxxx
  public static final Function<Integer, Integer> factorial0 = n -> n <= 1 ? n : n * FunctionExamples.factorial0.apply(n - 1);

  public static Function<Integer, Integer> factorial1;
  static {
    factorial1 = n -> n <= 1 ? n : n * FunctionExamples.factorial1.apply(n - 1);
  }

  //final requires this.xxx
  public final Function<Integer, Integer> factorial2 = n -> n <= 1 ? n : n * this.factorial2.apply(n - 1);

  //declaring in a method works because the method is declared before it is used
  public Function<Integer, Integer> factorial3;
  {
    factorial3 = n -> n <= 1 ? n : n * factorial3.apply(n - 1);
  }
}
