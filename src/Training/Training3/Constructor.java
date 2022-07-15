package Training.Training3;

public class Constructor {
    public void foo() {
        Flower rose = new Flower();
        rose.setColor("Красная");
        rose.setName("Роза");

        Flower pion = new Flower();
        pion.setColor("Белый");
        pion.setName("Пион");

        System.out.println(rose.getColor() + " " + rose.getName()  + " "+ "и" + " " + pion.getColor() + " " + pion.getName());

    }
}
