package web.model;

public class Car {

    private long id;

    private String model;

    private int series;

    public Car() {};

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}
