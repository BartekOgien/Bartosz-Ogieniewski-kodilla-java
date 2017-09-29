package com.kodilla.good.patterns.challenges.challenge2.DTO;

import com.kodilla.good.patterns.challenges.challenge2.users.User;

public class ShoppingDTO {
    public User user;
    public boolean isBought;

    public ShoppingDTO(User user, boolean isBought) {

        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
