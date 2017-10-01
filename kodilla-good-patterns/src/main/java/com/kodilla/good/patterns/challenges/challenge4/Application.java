package com.kodilla.good.patterns.challenges.challenge4;

import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightRepository;
import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightSearchEngine;
import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightSearchEngineAdvanced;
import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightService;
import com.kodilla.good.patterns.challenges.challenge4.Users.UserRequest;
import com.kodilla.good.patterns.challenges.challenge4.Users.UserRequestRetriever;

public class Application {

    public static void main(String[] args) {

        UserRequestRetriever userRequestRetriever = new UserRequestRetriever();
        UserRequest userRequest = userRequestRetriever.retrieve();
        new FlightService().userInformation(userRequest);

        FlightRepository flightRepository = new FlightRepository();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.getWhereYouCanFly(flightRepository.getFlightList(), "Warsaw");
        flightSearchEngine.getFromYouCanFly(flightRepository.getFlightList(), "Warsaw");

        FlightSearchEngineAdvanced flightSearchEngineAdvanced = new FlightSearchEngineAdvanced();
        flightSearchEngineAdvanced.getWhereYouCanFlyWithTransfer(flightRepository.getFlightList(), "Warsaw", "Poznan");

    }
}
