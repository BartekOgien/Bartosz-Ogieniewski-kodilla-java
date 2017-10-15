package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPP = "Shopp";
    public static final String PAINT = "Paint";
    public static final String DRIVE = "Drive";

    public Task makeTask(String task) {
        switch (task) {
            case SHOPP: return new ShoppingTask("ChocolateBuy", "chocolate", 5);
            case PAINT: return new PaintingTask("PaintHorse", "white", "horse");
            case DRIVE: return new DrivingTask("DriveToMiami", "Miami", "ferrari");
            default: return null;
        }
    }
}
