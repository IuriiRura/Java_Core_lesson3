package lesson7;

public abstract class Plane {
    private int length;
    private int width;
    private int weight;


    public Plane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;

    }
        public abstract void StartingVehicles();
            //int a = (int) (20 + (Math.random() * 68));
           // System.out.println("СУ27`s vehicles will be started in " + a + " seconds");

        public abstract void FlyOut();
           // double a = (Math.random() *1000);
           // System.out.println("СУ27 will fly for " + a +" kilometers");
        public abstract void Landing();
           // System.out.println("СУ27 is landing");

    @Override
    public String toString() {
        return "Plane CУ27: " +
                "length " + length +
                ", width " + width +
                ", weight " + weight;
    }
}


