package training;

public class Car {
    private int maxSpeed = 200;
    private String model = "car";

    public Car(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void getMaxSpeed() {
        System.out.println(this.model + "`s max speed is " + this.maxSpeed);

    }
}
