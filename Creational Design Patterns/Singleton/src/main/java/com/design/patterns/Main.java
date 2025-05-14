package com.design.patterns;

import com.design.patterns.configuration.DbConfiguration;
import com.design.patterns.singleton.Singleton;
import com.design.patterns.singleton.ThreadSafeSingleton;

public class Main {

  public static void main(String[] args) {
    System.out.println("Let's learn about Singleton Design Pattern!");


    // Create a Singleton instance

   // DbConfiguration dbConfiguration= new DbConfiguration(); //cannot instantiate because the only constructor is private

    DbConfiguration.getInstance(); //accessing the singleton DB instance

    Singleton.getInstance();
    ThreadSafeSingleton.getInstance();


  }
}
