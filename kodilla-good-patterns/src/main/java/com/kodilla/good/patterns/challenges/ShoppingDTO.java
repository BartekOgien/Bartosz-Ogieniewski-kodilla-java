package com.kodilla.good.patterns.challenges;

public class ShoppingDTO {
    public User user;
    public boolean isBought;

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }

    public ShoppingDTO(User user, boolean isBought) {

        this.user = user;
        this.isBought = isBought;
    }
}
