package com.kodilla.good.patterns.challenges.challenge4.Users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserRequestRetriever {

    public UserRequest retrieve() {
        User user = new User("John", "Kowalskyy");
        LocalDateTime loginTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timeOfLogin = loginTime.format(formatter);
        return new UserRequest(user, timeOfLogin);
    }
}
