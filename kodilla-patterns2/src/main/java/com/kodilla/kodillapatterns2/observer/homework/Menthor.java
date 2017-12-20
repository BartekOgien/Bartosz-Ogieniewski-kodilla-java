package com.kodilla.kodillapatterns2.observer.homework;

public class Menthor implements Observer {
    private final String name;
    private int updateCount;

    public Menthor(String name) {
        this.name = name;
    }

    @Override
    public void update(Participant participant) {
        System.out.println(name + ": New task from " + participant.getName() +
                "\n" + " (total: " + participant.getTaskQueue().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
