package com.kodilla.good.patterns.challenges.challenge4;

import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightSearchEngine;
import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightSearchEngineAdvanced;
import com.kodilla.good.patterns.challenges.challenge4.Flights.FlightService;
import com.kodilla.good.patterns.challenges.challenge4.Users.UserRequest;
import com.kodilla.good.patterns.challenges.challenge4.Users.UserRequestRetriever;

public class Application {

    public static void main(String[] args) {

        UserRequestRetriever userRequestRetriever = new UserRequestRetriever();
        UserRequest userRequest = userRequestRetriever.retrieve();
        new FlightService().getuserInformation(userRequest);

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.getWhereYouCanFly("Warsaw");
        flightSearchEngine.getFromYouCanFly("Warsaw");

        FlightSearchEngineAdvanced flightSearchEngineAdvanced = new FlightSearchEngineAdvanced();
        flightSearchEngineAdvanced.getWhereYouCanFlyWithTransfer("Warsaw", "Poznan");

    }
}
