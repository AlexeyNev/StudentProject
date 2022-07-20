package Training.Training11;

/**
 * Перегрузка методов - это методы с одинаковым названием, но с разными параметрами,
 * т.е методы называются одинаково, но делают разное учитывая параметры
 */

/**
 * toString - метод чтобы представлять объект в виде строки
 */
public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human("Petr", 25);

        System.out.println(human);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
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
