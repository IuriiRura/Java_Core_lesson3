package ua.lviv.logos.lesson4.Animal;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal("Lizard", 4, 2);
        System.out.println("Species: " + animal.getSpecies() + ", speed = " + animal.getSpeed() +
                " km/h" + ", age = "+ animal.getAge() + " years");
        animal.setSpecies("Tiger");
        animal.setSpeed(2);
        animal.setAge(14);
        System.out.println("Species: " + animal.getSpecies() + ", speed = " + animal.getSpeed() +
                " km/h" + ", age = "+ animal.getAge() + " years");



    }
}
