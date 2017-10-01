package com.kodilla.good.patterns.challenges.challenge4.Users;

public class UserRequest {

    User user;
    String loginTime;

    public UserRequest(User user, String loginTime) {
        this.user = user;
        this.loginTime = loginTime;
    }

    public User getUser() {
        return user;
    }

    public String getLoginTime() {
        return loginTime;
    }
}
