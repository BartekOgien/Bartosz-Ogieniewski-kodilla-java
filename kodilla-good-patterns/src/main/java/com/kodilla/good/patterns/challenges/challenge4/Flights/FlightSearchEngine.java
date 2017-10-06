package com.kodilla.good.patterns.challenges.challenge4.Flights;


public class FlightSearchEngine {
    private FlightRepository flightrepository = new FlightRepository();

    public void getWhereYouCanFly(String startAirport) {
        System.out.println("List of flights from: " + startAirport);
        flightrepository.getFlightList().stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .forEach(f -> System.out.println(f));
    }

    public void getFromYouCanFly(String finishAirport) {
        System.out.println("List of flights to: " + finishAirport);
        flightrepository.getFlightList().stream()
                .filter(flight -> flight.getDestinationAirport().equals(finishAirport))
                .forEach(f -> System.out.println(f));
    }
}
