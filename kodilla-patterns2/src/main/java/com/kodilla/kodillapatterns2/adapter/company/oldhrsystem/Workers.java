package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"67030212345", "John", "Smith"},
            {"72030212345", "Ivone", "Novak"},
            {"71030212345", "Jessie", "Pinkman"},
            {"69030212345", "Walter", "White"},
            {"73030212345", "Clara", "Larson"}};
    private double[] salaries = {4500.00, 3700.00, 4350.00, 9000.00, 6200};

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + "," + workers[n][1]+ "," + workers[n][2]+ "," + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
