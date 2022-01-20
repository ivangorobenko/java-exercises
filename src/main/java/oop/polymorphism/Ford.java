package oop.polymorphism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Ford");
        return "Ford starts engine";
    }

    @Override
    public String accelerate() {
        System.out.println("Ford");
        return "Fort accelerates";
    }

    @Override
    public String brake() {
        System.out.println("Ford");
        return "Ford brakes";
    }

}