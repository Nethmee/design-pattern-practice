package com.design.patterns.singleton;

public class Singleton {

  //creating a private static instance of the class
  private static Singleton instance;

  /*
  * static instances or method belongs to the class itself, so it can be accessed by the class name
  * from any thread in the program
  * */

  //private constructor to prevent instantiation
  private Singleton() {
    System.out.println("Singleton instance created!");
  }

  public Singleton(String name) {
    System.out.println("Singleton instance created with name: " + name);
  }


  public static Singleton getInstance() {
    if(instance ==null){
      instance = new Singleton();
    }
    return instance;
  }

/*    Why this is not thread safe?
*
* 1. since the Singleton-> getInstance method is a static method it can be accessed through any thread simultaneously
* 2. when that happens,even though from a single thread we this Object cannot be created twice, from multiple threads it can happen.
* 3. That's why this implementation is not thread safe.
* */

}
