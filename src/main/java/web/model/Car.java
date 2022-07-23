package web.model;

public class Car {
    private int id;
    private String model;
    private int speed;

    public Car(int id, String model, int speed) {
        this.id = id;
        this.model = model;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
