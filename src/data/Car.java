package data;

/**
 * Created by Bartłomiej Skorowski on 28.01.2020.
 */
public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;

    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    public Car (int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0)
            this.year = year;
        else
            System.out.println("Rok niepoprawny");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
}
