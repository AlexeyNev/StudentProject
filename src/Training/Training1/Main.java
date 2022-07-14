package Training.Training1;

import Training.Training1.Bus;
import Training.Training3.Constructor;

public class Main {
    public static void main(String[] args) {
        Bus oneBus = new Bus();
        Bus twoBus = new Bus();
        Bus threeBus = new Bus();

        oneBus.setColor("Yellow");
        oneBus.setManySeats(50);
        oneBus.setNumberMarshruta(41);

        twoBus.setColor("Red");
        twoBus.setManySeats(30);
        twoBus.setNumberMarshruta(23);

        threeBus.setColor("Blue");
        threeBus.setManySeats(60);
        threeBus.setNumberMarshruta(50);

        Constructor constructor = new Constructor();
        constructor.foo();

    }
}
