package com.kodilla.good.patterns.challenges.challenge4.Flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngineAdvanced {

    public void getWhereYouCanFlyWithTransfer(Set<Flight> flightList, String finishAirport, String startAirport) {
        System.out.println("List of flights with transfer from: " + startAirport + " , to: " + finishAirport);
        List<Flight> flightToAirport = flightList.stream()
                .filter(flight -> flight.getDestinationAirport().equals(finishAirport))
                .filter(flight -> !flight.getStartAirport().equals(startAirport))
                .collect(Collectors.toList());

        List<Flight> flightFromAirport = flightList.stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .filter(flight -> !flight.getDestinationAirport().equals(finishAirport))
                .collect(Collectors.toList());

        Set<FlightTransfer> flightTransferList = new HashSet<>();

        for(int i=0; i<flightToAirport.size(); i++) {

            for (int j=0; j<flightFromAirport.size(); j++) {

                if(flightFromAirport.get(i).getDestinationAirport().equals(flightToAirport.get(j).getStartAirport())) {
                    flightTransferList.add(new FlightTransfer(flightFromAirport.get(i), flightToAirport.get(j)));
                }
            }
        }
        flightTransferList.stream()
                .forEach(f -> System.out.println(f));
    }
}
