package ua.lviv.logos.lesson4;

import java.lang.reflect.Array;

public class ApplicationRobots {
    public static void main(String[] args) {
                    //case1
        Robot Robot = new Robot("I Am Robot", " - I'm just working");

        Robot.work();
        CoffeeRobot CoffeeRobot = new CoffeeRobot("I am Coffee Robot", " - I'm making coffee");

        CoffeeRobot.work();
        RobotDancer RobotDancer = new RobotDancer("I am Robot Dancer", " - I'm just dancing");

        RobotDancer.work();
        RobotCooker RobotCooker = new RobotCooker("I am Robot Cooker", " - I'm just cooking");

        RobotCooker.work();
        System.out.println("          " +
                "                " +
                "           ");


        Robot [] RobotsArray = new Robot[4];
        RobotsArray[0] = Robot;
        RobotsArray[1] = CoffeeRobot;
        RobotsArray[2] = RobotDancer;
        RobotsArray[3] = RobotCooker;


        for(int i = 0; i < RobotsArray.length; i++) {

            RobotsArray[i].work();


        }

    }

}
