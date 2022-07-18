package Training.Training10;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person max = new Person();
        max.age = 23;
        max.name = "Макс";
        max.foo();
        Person vlad = new Person();
        vlad.age = 15;
        vlad.name = "Владик";
        vlad.foo();

        Person alex = new Alex();
        alex.myName();
        alex.sayHello();

        Person petr = new Petr();
        petr.myName();


        Person person = new Person();
        person.myName();
        person.foo();
    }
}
    class Person {
        String name;
        int age;

        void foo() {
            System.out.println(name + " " + age);
        }

        void myName() {
            System.out.println("Меня зовут");
        }

        void sayHello() {
            System.out.println("Hello!");
        }
    }
