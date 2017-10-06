package com.kodilla.good.patterns.challenges.challenge4.Flights;

public class Flight {

    private String startAirport;
    private String destinationAirport;

    public Flight(String startAirport, String destinationAirport) {
        this.startAirport = startAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getStartAirport() {
        return startAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (startAirport != null ? !startAirport.equals(flight.startAirport) : flight.startAirport != null) return false;
        return destinationAirport != null ? destinationAirport.equals(flight.destinationAirport) : flight.destinationAirport == null;
    }

    @Override
    public int hashCode() {
        int result = startAirport != null ? startAirport.hashCode() : 0;
        result = 31 * result + (destinationAirport != null ? destinationAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{Flight: " + startAirport +
                " -> " + destinationAirport +
                "}";
    }
}
