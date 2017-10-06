package com.kodilla.good.patterns.challenges.challenge4.Flights;

import com.kodilla.good.patterns.challenges.challenge4.Flights.Flight;

import java.util.HashSet;
import java.util.Set;

public final class FlightRepository {
    private final Set<Flight> flightList = new HashSet<>();

    public FlightRepository() {
        flightList.add(new Flight("Warsaw", "Gdansk"));
        flightList.add(new Flight("Warsaw", "Cracow"));
        flightList.add(new Flight("Warsaw", "Poznan"));
        flightList.add(new Flight("Warsaw", "Berlin"));
        flightList.add(new Flight("Poznan", "Gdansk"));
        flightList.add(new Flight("Poznan", "Cracow"));
        flightList.add(new Flight("Poznan", "Warsaw"));
        flightList.add(new Flight("Poznan", "Berlin"));
        flightList.add(new Flight("Gdansk", "Berlin"));
        flightList.add(new Flight("Gdansk", "Warsaw"));
        flightList.add(new Flight("Gdansk", "Poznan"));
        flightList.add(new Flight("Gdansk", "Cracow"));
        flightList.add(new Flight("Cracow", "Warsaw"));
        flightList.add(new Flight("Cracow", "Poznan"));
        flightList.add(new Flight("Cracow", "Gdansk"));
        flightList.add(new Flight("Cracow", "Berlin"));
        flightList.add(new Flight("Berlin", "Warsaw"));
        flightList.add(new Flight("Berlin", "Poznan"));
        flightList.add(new Flight("Berlin", "Gdansk"));
        flightList.add(new Flight("Berlin", "Cracow"));
    }

    public Set<Flight> getFlightList() {
        return flightList;
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public void removeFlight(Flight flight) {
        flightList.remove(flight);
    }

}
