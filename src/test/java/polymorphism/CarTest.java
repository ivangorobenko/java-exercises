package polymorphism;

import oop.polymorphism.Car;
import oop.polymorphism.Ford;
import oop.polymorphism.Holden;
import oop.polymorphism.Mitsubishi;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    public void should_test_polymorphism(){
        Car ford ;
        ford = new Ford(6,"Mitsubishi");
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());

        Car mitsu ;
        mitsu = new Mitsubishi(6,"Mitsubishi");
        System.out.println(mitsu.accelerate());
        System.out.println(mitsu.startEngine());
        System.out.println(mitsu.brake());

        Car holden ;
        holden = new Holden(6,"Mitsubishi");
        System.out.println(holden.accelerate());
        System.out.println(holden.startEngine());
        System.out.println(holden.brake());
    }

}