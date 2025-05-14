package com.design.patterns.singleton;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {
    System.out.println("Thread safe singleton instance created !");
  }

  public static synchronized ThreadSafeSingleton getInstance() {
    if(instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }
}
