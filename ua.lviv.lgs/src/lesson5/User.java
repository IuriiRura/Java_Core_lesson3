package lesson5;

public class User {
    int id;
    String login;
    int age;
    String password;
    String sex;
    boolean IsMarried = false;
    double weight;
    double height;

    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }


    public User( int id, String login, String password, int age, double weight, double height,
                 String sex, boolean IsMarried) {
        this(id, login, password);
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.IsMarried = IsMarried;
    }


    @Override
    public String toString() {
        return "User: " +
                "id=" + id +
                ", login=" + login  +
                ", age=" + age +
                ", password=" + password  +

                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex  +
                ", IsMarried=" + IsMarried;
    }
}

