package Training.Training1;

public class Bus {
    /**
     * model и color это поля
     */
    public String model;
    public String color;
    public int manySeats;
    public int numberMarshruta;

    /**
     * showColor это метод
     */
    public void showColor() {
        System.out.println(color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManySeats() {
        return manySeats;
    }

    public void setManySeats(int manySeats) {
        this.manySeats = manySeats;
    }

    public int getNumberMarshruta() {
        return numberMarshruta;
    }

    public void setNumberMarshruta(int numberMarshruta) {
        this.numberMarshruta = numberMarshruta;
    }
}
