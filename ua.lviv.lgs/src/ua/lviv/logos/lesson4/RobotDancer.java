package ua.lviv.logos.lesson4;

public class RobotDancer extends Robot {
    private String KindOfRobot;
    private String doing;
    RobotDancer(String KindOfRobot, String doing) {
        super(KindOfRobot, doing);
        this.KindOfRobot = KindOfRobot ;
        this.doing = doing;
    }

    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }

    }
