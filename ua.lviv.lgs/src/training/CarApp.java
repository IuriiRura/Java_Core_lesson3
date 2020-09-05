package training;

public class CarApp {
    public static void main(String[] args) {
        Toyota supra = new Toyota(400, "supra");
        Mitsubishi eclipse = new Mitsubishi(330, "Eclipse");
        Ford mustang = new Ford(300, "focus");
        supra.getMaxSpeed();
        eclipse.getMaxSpeed();
        mustang.getMaxSpeed();
    }
}
