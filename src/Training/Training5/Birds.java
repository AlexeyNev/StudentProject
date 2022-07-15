package Training.Training5;

/**
 * Полиморфизм(динамический) - переопределение методов! Метод тот же но с изменениями
 */
public class Birds {

    private String name;

    public void walk() {
        System.out.println("Птица гуляет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
