package ua.lviv.logos.lesson4;

public class ApplicationRobots {
    public static void main(String[] args) {
                    //case1
        //Robot R = new Robot("Я Robot", "- я просто працюю");
        //System.out.println(R);
        //CoffeeRobot CoffeeR = new CoffeeRobot("Я CoffeeRobot", "- я варю каву");
        //System.out.println(CoffeeR);
        //RobotDancer RobotD = new RobotDancer("Я RobotDancer", "- я просто танцюю");
        //System.out.println(RobotD);
        //RobotCooker RobotC = new RobotCooker("Я RobotCooker", "- я просто готую");
        //System.out.println(RobotC);


                        //case2
        Robot R = new Robot();
        R.work("Я Я Robot", "- я просто працюю");
        CoffeeRobot CoffeeR = new CoffeeRobot();
        CoffeeR.work("Я CoffeeRobot", "- я готую каву");
        RobotDancer RobotD = new RobotDancer();
        RobotD.work("Я RobotDancer", "- я просто танцюю");
        RobotCooker RobotC = new RobotCooker();
        RobotC.work("Я RobotCooker", "- я просто готую");

    }

}
