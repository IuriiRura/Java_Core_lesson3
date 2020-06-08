package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        Person p = new Person("Johnny", 25, new Wallet (12542.6, 11.0));
        System.out.println(p);
    }


}
