package inheritance;

public class RaceCar extends Car {
    public int spoiler;

    public RaceCar(int spoiler, int gear) {
        super(4,2,true,gear);
        this.spoiler = spoiler;
    }
}
