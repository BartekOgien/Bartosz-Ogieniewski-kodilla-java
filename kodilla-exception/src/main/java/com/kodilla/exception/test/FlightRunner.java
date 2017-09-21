package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightRunner {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Amsterdam", true);
        airports.put("Barcelona", true);
        airports.put("Zurich", true);
        airports.put("Paris", false);
        airports.put("London", false);
        airports.put("Manchester", false);

        System.out.println("Searching route to: " + flight.getArrivalAirport());

        if(airports.containsKey(flight.getArrivalAirport())) {

            if(airports.get(flight.getArrivalAirport())) {
                System.out.println("Route to: " + flight.getArrivalAirport() + " found. Do you want to buy ticket?");
            }

            else {
                System.out.println("Route to: " + flight.getArrivalAirport() + " found, but now we don't have any flights to this airport.");
            }
        }

        else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {

        FlightRunner flightRunner = new FlightRunner();
        Flight flightToAmsterdam = new Flight("Warsaw", "Amsterdam");
        Flight flightToLondon = new Flight("Warsaw", "London");
        Flight flightToBerlin = new Flight("Warsaw", "Berlin");

        try {
            flightRunner.findFlight(flightToAmsterdam);

        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }

        try {
            flightRunner.findFlight(flightToLondon);

        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }

        try {
            flightRunner.findFlight(flightToBerlin);

        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }
    }
}
