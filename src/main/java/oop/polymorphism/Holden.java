package oop.polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Holden");
        return "Holden starts engine";
    }

    @Override
    public String accelerate() {
        System.out.println("Holden");
        return "Holden accelerates";
    }

    @Override
    public String brake() {
        System.out.println("Holden");
        return "Holden brakes";
    }

}