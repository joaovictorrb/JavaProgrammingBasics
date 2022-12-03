package course.constructors;

public class Car {
    public String model;
    public String plate;
    public String color;

    // Default constructor
    public Car() {}

    // Constructor with attributes
    public Car(String model, String plate, String color){
        this.model = model;
        this.plate = plate;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
