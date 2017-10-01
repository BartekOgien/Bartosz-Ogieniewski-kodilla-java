package com.kodilla.good.patterns.challenges.challenge4.Flights;

import com.kodilla.good.patterns.challenges.challenge4.Flights.Flight;

public class FlightTransfer {

    private Flight firstFlight;
    private Flight secondFlight;

    public FlightTransfer(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }

    @Override
    public String toString() {
        return "{firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}
