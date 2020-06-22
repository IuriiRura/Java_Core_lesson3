package lesson6;

public class WorkerPpH implements Payment {
    private String name;
    private double paymentPerHour;
    private int workingDays;
    private int hoursPerDay;

    public WorkerPpH(String name, double paymentPerHour, int workingDays, int hoursPerDay) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingDays = workingDays;
        this.hoursPerDay = hoursPerDay;
    }

    @Override
    public void payment() {
        System.out.println( name + "`s payment is " + paymentPerHour * workingDays * hoursPerDay);
    }
}
