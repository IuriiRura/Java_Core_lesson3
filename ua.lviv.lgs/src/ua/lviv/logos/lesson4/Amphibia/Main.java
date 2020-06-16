package ua.lviv.logos.lesson4.Amphibia;

import javafx.scene.AmbientLight;

public class Main {





    public static void main(String[] args) {
        Amphibia frog =  new Frog();



        frog.eat();
        System.out.println(frog.sleep());
        System.out.println(frog.swim());
        System.out.println(frog.walking());
    }
}
