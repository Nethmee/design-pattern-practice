package com.design.patterns.hometheatre.subcomponents;

public class DVDPlayer {

  boolean isOn ;
  boolean isPlaying ;
  boolean isPause ;
  boolean isStopped ;
  int brightness;


  public DVDPlayer() {
    this.isOn = false;
    this.isPlaying = false;
    this.isPause = false;
    this.isStopped = true;
    this.brightness = 0;
  }
  public void on() {
    isOn = true;
    System.out.println("DVD Player is ON");
  }
  public void off() {
    isOn = false;
    System.out.println("DVD Player is OFF");
  }
  public void play(String movieName) {
    if (isOn) {
      isPlaying = true;
      isStopped = false;
      System.out.println("DVD Player is PLAYING the movie : "+ movieName);
    } else {
      System.out.println("DVD Player is OFF. Please turn it ON first.");
    }
  }
  public void pause() {
    if (isOn && isPlaying) {
      isPause = true;
      isPlaying = false;
      System.out.println("DVD Player is PAUSED");
    } else {
      System.out.println("DVD Player is OFF or not PLAYING. Please turn it ON and PLAY first.");
    }

  }
}
