package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Participant implements Observable {
    private final String name;
    private final Queue<String> taskQueue;
    private final List<Observer> observers;

    public Participant(String name) {
        this.name = name;
        taskQueue = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTask(String task) {
        taskQueue.add(task);
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public Queue<String> getTaskQueue() {
        return taskQueue;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
