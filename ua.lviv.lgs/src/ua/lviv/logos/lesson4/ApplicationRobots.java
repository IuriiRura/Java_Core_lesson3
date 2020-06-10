package ua.lviv.logos.lesson4;

import java.lang.reflect.Array;

public class ApplicationRobots {
    public static void main(String[] args) {
                    //case1
        Robot Robot = new Robot("I Am Robot", " - I'm just working");
        System.out.println(Robot);
        CoffeeRobot CoffeeRobot = new CoffeeRobot("I am Coffee Robot", " - I'm making coffee");
        System.out.println(CoffeeRobot);
        RobotDancer RobotDancer = new RobotDancer("I am Robot Dancer", " - I'm just dancing");
        System.out.println(RobotDancer);
        RobotCooker RobotCooker = new RobotCooker("I am Robot Cooker", " - I'm just cooking");
        System.out.println(RobotCooker);



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
