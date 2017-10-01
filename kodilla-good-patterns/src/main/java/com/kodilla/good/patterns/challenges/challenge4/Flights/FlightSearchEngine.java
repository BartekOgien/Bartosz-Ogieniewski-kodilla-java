package com.kodilla.good.patterns.challenges.challenge4.Flights;

import com.kodilla.good.patterns.challenges.challenge4.Flights.Flight;

import java.util.Set;

public class FlightSearchEngine {

    public void getWhereYouCanFly(Set<Flight> flightList, String startAirport) {
        System.out.println("List of flights from: " + startAirport);
        flightList.stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .forEach(f -> System.out.println(f));
    }

    public void getFromYouCanFly(Set<Flight> flightList, String finishAirport) {
        System.out.println("List of flights to: " + finishAirport);
        flightList.stream()
                .filter(flight -> flight.getDestinationAirport().equals(finishAirport))
                .forEach(f -> System.out.println(f));
    }
}
