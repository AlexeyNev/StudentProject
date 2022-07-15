package Training.Training5;

public class Vorona extends Birds {

    public void fly() {
        System.out.println("Летает");
    }

    @Override
    public void walk() {
        System.out.println("Метод опять определился третий раз");
    }
}
