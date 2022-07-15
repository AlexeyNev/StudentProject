package Training.Training1;

import Training.Training3.Constructor;
import Training.Training4.Bus;
import Training.Training5.Birds;
import Training.Training5.Straus;
import Training.Training5.Tesst;
import Training.Training5.Vorona;

public class Main {
    public static void main(String[] args) {
//        Bus oneBus = new Bus();
//        Bus twoBus = new Bus();
//        Bus threeBus = new Bus();
//
//        oneBus.setColor("Yellow");
//        oneBus.setManySeats(50);
//        oneBus.setNumberMarshruta(41);
//
//        twoBus.setColor("Red");
//        twoBus.setManySeats(30);
//        twoBus.setNumberMarshruta(23);
//
//        threeBus.setColor("Blue");
//        threeBus.setManySeats(60);
//        threeBus.setNumberMarshruta(50);
//
//        Constructor constructor = new Constructor();
//        constructor.foo();

//        Bus bus = new Bus();
//        System.out.println(bus.showM());
//        Straus straus = new Straus();
//        straus.setName("Страус");
//        straus.walk();

        Birds straus2 = new Straus();
        Birds voron = new Vorona();

        Tesst tesst = new Tesst();
        tesst.foo(voron);
    }
}
