package com.design.patterns.hometheatre;

import com.design.patterns.hometheatre.subcomponents.Amplifier;
import com.design.patterns.hometheatre.subcomponents.DVDPlayer;
import com.design.patterns.hometheatre.subcomponents.Lights;
import com.design.patterns.hometheatre.subcomponents.Projector;

public class HomeTheaterFacade {


  private Amplifier amplifier;
  private DVDPlayer dvdPlayer;
  private Projector projector;
  private Lights lights;

  //dependency injection
  public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector, Lights lights) {
    this.amplifier = amplifier;
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.lights = lights;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    lights.dim(10);
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setVolumnIntensity(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }
}
