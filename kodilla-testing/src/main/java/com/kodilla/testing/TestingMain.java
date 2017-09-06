package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator calculator = new Calculator();
        if (calculator.add(3, 5)==8) {
            System.out.println("First calculator test ok");
        }
        else {
            System.out.println("Error");
        }

        if (calculator.substract(7, 5)==2) {
            System.out.println("Second calculator test ok");
        }
        else {
            System.out.println("Error");
        }
    }
}
