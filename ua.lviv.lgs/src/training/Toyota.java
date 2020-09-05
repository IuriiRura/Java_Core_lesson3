package training;

public class Toyota extends  Car {
    public int maxSpeed = 220;
    public String model = "prius";

    public Toyota(int maxSpeed, String model) {
        super(maxSpeed, model);
    }


    @Override
    public void getMaxSpeed() {
        super.getMaxSpeed();
    }
}
