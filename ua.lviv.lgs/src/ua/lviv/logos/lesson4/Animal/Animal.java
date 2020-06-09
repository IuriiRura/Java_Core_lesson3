package ua.lviv.logos.lesson4.Animal;

public class Animal {
    private String species;
    private int speed;
    private int age;
    Animal(String species, int speed, int age) {
        super();
        this.species = species;
        this.speed = speed;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal:" +
                " species" + species +  ", speed" + speed +
                ", age=" + age;
    }
}
