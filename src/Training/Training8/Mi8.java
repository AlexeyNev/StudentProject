package Training.Training8;

public class Mi8 extends Helicopter implements VerticalTakeOff {
    @Override
    public void fly() {
        System.out.println("Вертолет летит");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Вертолет летит вертикально");
    }
}
