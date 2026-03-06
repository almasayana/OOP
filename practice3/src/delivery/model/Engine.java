package delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public void getEngineInfo() {
        System.out.println("Engine Type: " + type + ", HP: " + horsePower);
    }
}