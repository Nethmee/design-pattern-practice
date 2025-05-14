package com.design.patterns;

import com.design.patterns.facade.TravelBookingFacade;
import com.design.patterns.facade.TravelBookingFacadeImpl;
import com.design.patterns.subsystem.FlightBookingSystem;
import com.design.patterns.subsystem.HotelBookingSystem;
import com.design.patterns.subsystem.TaxiBookingSystem;

public class TravelBookingSystemMain {

  public static void main(String[] args) {

    System.out.println("=== Welcome to Travel Booking System! ===");

    FlightBookingSystem flightBookingSystem = new FlightBookingSystem();
    HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();
    TaxiBookingSystem taxiBookingSystem = new TaxiBookingSystem();

    TravelBookingFacade travelBookingFacade = new TravelBookingFacadeImpl(flightBookingSystem,
        hotelBookingSystem, taxiBookingSystem);

    // Book a trip

    System.out.println("\n\n=== Book a trip ===");

    travelBookingFacade.bookTrip();

    //cancel trip

    System.out.println("\n\n=== Cancel a trip ===");
    travelBookingFacade.cancelTrip();
  }
}
