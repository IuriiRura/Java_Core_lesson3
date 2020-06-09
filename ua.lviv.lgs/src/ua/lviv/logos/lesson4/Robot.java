package ua.lviv.logos.lesson4;

public class Robot {
    // case 1
    private String KindOfRobot;
   private String doing;
    Robot (String KindOfRobot,String doing) {
       super();
       this.KindOfRobot = "Im a Robot";
       this.doing = "I am just working";

    }


    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }


            // case 2
    public String work () {
        return this.KindOfRobot + " " + this.doing;

    };
}
