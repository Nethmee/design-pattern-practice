package com.design.patterns.facade;

import com.design.patterns.subsystem.FlightBookingSystem;
import com.design.patterns.subsystem.HotelBookingSystem;
import com.design.patterns.subsystem.TaxiBookingSystem;

public class TravelBookingFacadeImpl implements TravelBookingFacade {

  FlightBookingSystem flightBookingSystem;
  HotelBookingSystem hotelBookingSystem;
  TaxiBookingSystem taxiBookingSystem;

  public TravelBookingFacadeImpl(FlightBookingSystem flightBookingSystem,
      HotelBookingSystem hotelBookingSystem, TaxiBookingSystem taxiBookingSystem) {

    this.flightBookingSystem = flightBookingSystem;
    this.hotelBookingSystem = hotelBookingSystem;
    this.taxiBookingSystem = taxiBookingSystem;
  }


  @Override
  public void bookTrip() {
//first start with finding flight and hotel options
    flightBookingSystem.getAvailableTravelRoutes();
    flightBookingSystem.getAvailableFlightsPerRoute();
    flightBookingSystem.compareFlightPrices();
    flightBookingSystem.bookFlight();
    hotelBookingSystem.getAvailableHotels();
    hotelBookingSystem.compareHotels();
    hotelBookingSystem.bookHotel();
    hotelBookingSystem.getHotelDetails();
    taxiBookingSystem.getAvailableTaxisforPrebooking();
    taxiBookingSystem.bookTaxi();


  }

  @Override
  public void cancelTrip() {

    hotelBookingSystem.cancelHotelBooking();
    hotelBookingSystem.applyRefund();
    flightBookingSystem.cancelFlightBooking();
    flightBookingSystem.getRefund();
    taxiBookingSystem.cancelTaxi();

  }
}
