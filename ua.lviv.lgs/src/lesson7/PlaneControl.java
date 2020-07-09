package lesson7;

public class PlaneControl {


    void MoveRight() {
        int a = (int) (Math.random()*100);
        System.out.println("CУ27 is moving right for " + a +" kilometers");
    }
    void MoveLeft() {
        int a = (int) (Math.random()*100);
        System.out.println("CУ27 is moving left for " + a +" kilometers");
    }
    void MoveUp() {
        int a = (int) (Math.random()*100);
        System.out.println("CУ27 is moving up for " + a +" kilometers");
    }
    void MoveDown() {
        int a = (int) (Math.random()*100);
        System.out.println("CУ27 is moving down for " + a +" kilometers");
    }

}
