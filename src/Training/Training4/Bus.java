package Training.Training4;

public class Bus {
    public String model,color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D4fGG";
    public final int SERIAL_NUMBER_2 = 12321;

    public void go() {
        System.out.println("ПОЕХАЛИ");
    }

    public Engine showM() {
        engine = new Engine();
        return engine;
    }

}
