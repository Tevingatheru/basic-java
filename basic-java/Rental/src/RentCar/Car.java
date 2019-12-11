
package RentCar;

public class Car {
    private int numberOfWheels;
    private String model;

    public Car(int numberOfWheels, String model) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
    }

    public Car() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
