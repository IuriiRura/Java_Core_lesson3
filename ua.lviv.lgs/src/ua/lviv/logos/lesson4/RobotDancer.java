package ua.lviv.logos.lesson4;

public class RobotDancer extends Robot {
    private String KindOfRobot;
    private String doing;
    RobotDancer(String KindOfRobot, String doing) {
        super(KindOfRobot, doing);
        this.KindOfRobot = "I am Robot Dancer";
        this.doing = "I am Just Dancing";
    }

    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }

    //case2
        @Override
        public String work () {
            return this.KindOfRobot + " " + this.doing;
        }
    }
