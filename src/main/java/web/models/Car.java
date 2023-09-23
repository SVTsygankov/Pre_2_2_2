package web.models;

public class Car {

    private int id;

    private String modelCar;

    private int series;

    public Car(int id, String modelCar, int series) {
        this.id = id;
        this.modelCar = modelCar;
        this.series = series;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelCar() {
        return modelCar;
    }

    public int getSeries() {
        return series;
    }
}
