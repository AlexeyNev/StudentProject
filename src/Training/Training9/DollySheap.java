package Training.Training9;

public class DollySheap implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    /**
     * implements Cloneable - интерфейс метка. Просто помечаем класс данным интерфейсом
     */
}
