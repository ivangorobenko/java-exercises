package oop.polymorphism;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Mitsubishi");
        return "Mitsubishi starts engine";
    }

    @Override
    public String accelerate() {
        System.out.println("Mitsubishi");
        return "Mitsubishi accelerates";
    }

    @Override
    public String brake() {
        System.out.println("Mitsubishi");
        return "Mitsubishi brakes";
    }
}