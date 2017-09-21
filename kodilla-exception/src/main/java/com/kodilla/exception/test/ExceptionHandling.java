package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(0, 3);

        } catch (Exception e) {
            System.out.println("Wrong arguments! Y must be not equals 1,5 and X must be lesser than 2 and greater/equals than 1");
        }
    }
}
