package com.design.patterns;

import com.design.patterns.hometheatre.HomeTheaterFacade;
import com.design.patterns.hometheatre.subcomponents.Amplifier;
import com.design.patterns.hometheatre.subcomponents.DVDPlayer;
import com.design.patterns.hometheatre.subcomponents.Lights;
import com.design.patterns.hometheatre.subcomponents.Projector;

public class FacadeMain {

  public static void main(String[] args) {
    System.out.println("Let's learn about Facade Design Pattern!");

    Amplifier amplifier = new Amplifier();
    DVDPlayer dvdPlayer = new DVDPlayer();
    Projector projector = new Projector();
    Lights lights = new Lights();

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, lights);
    homeTheaterFacade.watchMovie("Harry Potter");
  }
}
