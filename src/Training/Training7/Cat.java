package Training.Training7;

public class Cat extends Animal {
    /**
     * Интерфейс - это то, что класс умеет делать, а абстрактный класс это то, чем класс является.
     */
    @Override
    public void makeSound() {
        System.out.println("МЯУ");
    }
}
