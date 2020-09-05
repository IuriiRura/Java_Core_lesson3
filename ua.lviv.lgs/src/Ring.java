 public class Ring {
    private double semidiameter;
    private double diameter;

    Ring () {
        this.diameter = 11;
        this.semidiameter = 5.5;
    }
    Ring (double diameter, double semidiameter){
        this.diameter = diameter;
        this.semidiameter = semidiameter;
    }
    public void square () {
        System.out.println("Ring's square = " + (3.14 * ((diameter)/2) * ((diameter)/2)));
    }
    public void Length () {
        System.out.println("Ring's Length = " + 2 * 3.14 * semidiameter);
    }

    public double getSemidiameter() {
        return semidiameter;
    }

    public void setSemidiameter(double semidiameter) {
        this.semidiameter = semidiameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

