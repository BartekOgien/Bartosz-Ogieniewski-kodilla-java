package com.kodilla.good.patterns.challenges.challenge2.informations;

import com.kodilla.good.patterns.challenges.challenge2.users.User;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Send mail to: " + user);
    }
}
