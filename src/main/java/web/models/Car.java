package web.models;

public class Car {

    private int id;

    private String modelCar;

    private int series;

    public Car() {
    }

    public Car(int id, String modelCar, int series) {
        this.id = id;
        this.modelCar = modelCar;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelCar='" + modelCar + '\'' +
                ", series=" + series +
                '}';
    }
}
