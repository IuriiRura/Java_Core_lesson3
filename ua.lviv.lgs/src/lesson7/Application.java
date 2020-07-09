package lesson7;

public class Application {
    public static void main(String[] args) {


        CУ27 plane = new CУ27(58, 32, 47, 1300, "Khaki" );
        System.out.println(plane);
        plane.StartingVehicles();
        plane.FlyOut();
        plane.movingRight();
        plane.movingLeft();
        plane.movingUp();
        plane.movingDown();
        plane.stealth();
        plane.attack();
        plane.SpeedBurst();
        plane.Landing();
    }
}
