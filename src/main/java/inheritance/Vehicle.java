package inheritance;

public class Vehicle {
    public int speed;
    private int direction;

    public Vehicle() {
        this.speed = 0;
        this.direction = 0;
    }


    public void handSteering(int direction) {
        this.direction = direction;
    }

    public void move(int speed) {
        this.speed = speed;
    }
}
