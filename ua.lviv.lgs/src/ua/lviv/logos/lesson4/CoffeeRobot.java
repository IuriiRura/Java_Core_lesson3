package ua.lviv.logos.lesson4;

public class CoffeeRobot extends Robot {

            //case 1
            private String KindOfRobot;
            private String doing;

    CoffeeRobot(String KindOfRobot, String doing) {
      super(KindOfRobot, doing);
        this.KindOfRobot = KindOfRobot ;
        this.doing = doing;

    }
    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }

}

