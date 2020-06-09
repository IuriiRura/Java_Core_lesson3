package ua.lviv.logos.lesson4;

public class RobotCooker extends Robot {
    private String KindOfRobot;
    private String doing;
   RobotCooker(String KindOfRobot, String doing) {
      super(KindOfRobot, doing);
       this.KindOfRobot = "I am Robot Cooker";
       this.doing = "I am Just Cooking";
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
