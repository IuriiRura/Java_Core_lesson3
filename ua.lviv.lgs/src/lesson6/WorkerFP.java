package lesson6;

public class WorkerFP implements Payment {
    private String name;
    private double payment;


    public WorkerFP(String name, double payment) {
        this.name = name;
        this.payment = payment;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public void payment() {
        System.out.println(name + "`s payment is " + payment);

    }
}
