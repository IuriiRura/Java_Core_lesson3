package lesson6;

public class Application {
    public static void main(String[] args) {


        WorkerPpH Worker1 = new WorkerPpH("Daniel", 18.6, 21, 12);
        WorkerFP Worker2 = new WorkerFP("Rossie", 5000);
        Worker1.payment();
        Worker2.payment();
    }
}
