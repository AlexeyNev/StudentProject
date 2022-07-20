package Training.Training11;

/**
 * Перегрузка методов - это методы с одинаковым названием, но с разными параметрами,
 * т.е методы называются одинаково, но делают разное учитывая параметры
 */
public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human("второй");
        Human human2 = new Human("третий", 1);
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Привет из первого конструктора");
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}