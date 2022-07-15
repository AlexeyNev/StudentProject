package Training.Training5;

public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public void walk() {
        System.out.println("Птица гуляет");
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
