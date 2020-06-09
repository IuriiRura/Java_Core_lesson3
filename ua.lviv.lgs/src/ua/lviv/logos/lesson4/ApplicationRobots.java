package ua.lviv.logos.lesson4;

import java.lang.reflect.Array;

public class ApplicationRobots {
    public static void main(String[] args) {
                    //case1
        Robot Robot = new Robot("", "");
        System.out.println(Robot);
        CoffeeRobot CoffeeRobot = new CoffeeRobot("", "");
        System.out.println(CoffeeRobot);
        RobotDancer RobotDancer = new RobotDancer("", "");
        System.out.println(RobotDancer);
        RobotCooker RobotCooker = new RobotCooker("", "");
        System.out.println(RobotCooker);


                        //case2
        //Robot Robot = new Robot();
        //Robot.work();
        //CoffeeRobot CoffeeRobot = new CoffeeRobot();
        //CoffeeRobot.work();
        //RobotDancer RobotDancer = new RobotDancer();
        //RobotDancer.work();
        //RobotCooker RobotCooker = new RobotCooker();
        //RobotCooker.work();


        Robot [] RobotsArray = new Robot[4];
        RobotsArray[0] = Robot;
        RobotsArray[1] = CoffeeRobot;
        RobotsArray[2] = RobotDancer;
        RobotsArray[3] = RobotCooker;


        for(int i = 0; i < RobotsArray.length; i++) {

            RobotsArray[i].work();
            System.out.println(RobotsArray[i]);

        }

    }

}
