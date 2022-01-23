package model;

public class Car {
    private String Model;
    private int Power;
    private String Color;

    public Car(String model, int power, String color) {
        Model = model;
        Power = power;
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
