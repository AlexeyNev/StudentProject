package Training.Training1;

import Training.Training3.Constructor;
import Training.Training4.Bus;
import Training.Training5.*;
import Training.Training6.AK47;
import Training.Training6.Weapon;
import Training.Training7.Animal;
import Training.Training7.Cat;
import Training.Training7.Dog;
import Training.Training8.Aircraft;
import Training.Training8.Boeing737;
import Training.Training8.Mi8;
import Training.Training8.Test;

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

//        Birds straus2 = new Straus();
//        Birds voron = new Vorona();
//        Birds sova = new Sova();
//        Birds sovushka = new Sova();
//
//        Tesst tesst = new Tesst();
//        tesst.foo(voron);

//        PremiumCar bmw = new Bmw();
//        PremiumCar mers = new Mers();
//        PremiumCar audi = new Audi();
//        PremiumCar car = new PremiumCar();
//
//        Cars cars = new Cars();
//        cars.rsl(car);
//        cars.rsl(mers);
//        cars.rsl(audi);
        /**
          Не можем создать объект данного класса Weapon,
          потому что абстрактный класс это всего лишь общее описание,
          но от классов потомков мы можешь унаследоваться от абстрактного класса
          (пример АК47)
         */
//        Weapon weapon = new AK47();
//        AK47 ak47 = new AK47();

//        Animal cat = new Cat();
//        Animal dog = new Dog();
//
//        cat.makeSound();
//        cat.eat();
//        dog.makeSound();
//        dog.eat();
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test test = new Test();
        test.foo(mi8);
        test.foo(boeing737);


    }
}
