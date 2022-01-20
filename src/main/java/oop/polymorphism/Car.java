package oop.polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        System.out.println("Engine is starting");
        return "Car accelerates";
    }

    public String accelerate(){
        System.out.println("Car is accelerating");
        return "Car accelerates";
    }

    public String brake(){
        System.out.println("Car is braking");
        return "Car accelerates";
    }


}
