package com.kodilla.good.patterns.challenges.challenge4.Flights;

import com.kodilla.good.patterns.challenges.challenge4.Users.UserRequest;

public class FlightService {

    public void getuserInformation(UserRequest userRequest) {
        System.out.println("User: " + userRequest.getUser() + " login to system at: " + userRequest.getLoginTime());
        System.out.println("Write what flight you search");
    }
}
