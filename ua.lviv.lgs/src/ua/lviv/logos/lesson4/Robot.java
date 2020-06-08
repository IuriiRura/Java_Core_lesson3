package ua.lviv.logos.lesson4;

public class Robot {
    private String KindOfRobot;
    private String doing;
    Robot (String KindOfRobot,String doing) {
        super();
        this.KindOfRobot = KindOfRobot;
        this.doing = doing;

    }
    public void work (String doing) {
        System.out.println(this.KindOfRobot + this.doing);

    };

    @Override
    public String toString() {
        return  KindOfRobot + " " +  doing;
    }
}
