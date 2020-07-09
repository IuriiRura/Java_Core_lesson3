package lesson7;

public class CУ27 extends Plane implements SpecialAbilities {
    private static PlaneControl plane = new PlaneControl();

    private String colour;
    private int maxSpeed;

    public CУ27(int length, int width, int weight, int maxSpeed, String colour) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public void movingRight() {
        plane.MoveRight();
        }
    public void movingLeft() {
        plane.MoveLeft();
    }
    public void movingUp() {
        plane.MoveUp();
    }
    public void movingDown() {
        plane.MoveDown();
    }

    @Override
    public void StartingVehicles() {
        int a = (int) (20 + (Math.random() * 68));
        System.out.println("СУ27`s vehicles will be started in " + a + " seconds");
    }

    @Override
    public void FlyOut() {
        double a = (Math.random() *1000);
        System.out.println("СУ27 will fly for " + a +" kilometers");
    }

    @Override
    public void Landing() {
        System.out.println("СУ27 is landing");
    }

    public void stealth() {
        int a = (int) (20+ Math.random()*120);
        System.out.println("СУ27 is invisible for " + a + " seconds");
    }
    public void SpeedBurst() {
        int a = (int) (( 25 + Math.random() * 100));
        System.out.println( "СУ27`s speed is " + a + " km/h" );
    }
    public void attack(){
        int a = (int) (1+ Math.random() * 10);
        System.out.println(a + " bombs will be dropped");
    }

    @Override
    public String toString() {
        return "CУ27:" + super.toString() +
                ", colour " + colour +
                ", maxSpeed " + maxSpeed;
    }
}

