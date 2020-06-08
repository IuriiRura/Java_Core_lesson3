package ua.lviv.logos.lesson4;

public class ApplicationRobots {
    public static void main(String[] args) {

        Robot R = new Robot("Я Robot","- я просто працюю");
        System.out.println(R);
        CoffeeRobot CoffeeR = new CoffeeRobot("Я CoffeeRobot", "- я варю каву");
        System.out.println(CoffeeR);
        RobotDancer RobotD = new RobotDancer("Я RobotDancer", "- я просто танцюю");
        System.out.println(RobotD);
        RobotCooker RobotC = new RobotCooker("Я RobotCooker",  "- я просто готую");
        System.out.println(RobotC);
    }

}
