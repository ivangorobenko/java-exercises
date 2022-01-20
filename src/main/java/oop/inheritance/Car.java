package oop.inheritance;

public class Car extends Vehicle {

    private final int wheels;
    private final int doors;
    private final boolean isManual;
    private final int gears;
    private int currentGear;


    public Car(int wheels, int doors, boolean isManual, int gears) {
        super();
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }


    public void changeGear(int gear) {
        if (gear > 0 && gear <= gears)
            this.currentGear = gear;
    }

    public void changeVelocity(int speed){
        this.speed = speed;
    }
    }

