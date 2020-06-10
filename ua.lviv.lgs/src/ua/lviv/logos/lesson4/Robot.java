package ua.lviv.logos.lesson4;

public class Robot {
    // case 1
    private String KindOfRobot;
   private String doing;
    Robot (String KindOfRobot,String doing) {
       super();
        this.KindOfRobot = KindOfRobot ;
        this.doing = doing;

    }

    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }


    public void work () {
        System.out.println(KindOfRobot + " " +  doing);
    }
}
