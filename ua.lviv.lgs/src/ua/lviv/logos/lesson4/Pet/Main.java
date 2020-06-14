package ua.lviv.logos.lesson4.Pet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();

        System.out.println();

        Cow cow = new Cow();
        cow.voice();

        System.out.println();

        Dog dog = new Dog();
        dog.voice();
    }
}
