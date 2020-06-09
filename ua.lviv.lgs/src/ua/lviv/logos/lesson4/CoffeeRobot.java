package ua.lviv.logos.lesson4;

public class CoffeeRobot extends Robot {

            //case 1
            private String KindOfRobot;
            private String doing;

    CoffeeRobot(String KindOfRobot, String doing) {
      super(KindOfRobot, doing);
        this.KindOfRobot = "I am Coffee Robot";
        this.doing = "I am Making coffee";

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

