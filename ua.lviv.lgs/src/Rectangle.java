package ua.lviv.lgs;

public class Rectangle {
    private int Lenght;
    private int Width;


    Rectangle () {
        this.Lenght = 20;
        this.Width = 10;
    }
    Rectangle (int Lenght, int Width) {
        this.Lenght = Lenght;
        this.Width = Width;
    }



    public void square () {

        System.out.println("Rectangle's square = " + Lenght*Width);
    }
    public void perimeter () {
        System.out.println("Rectangle's perimeter = " + 2 *(Lenght + Width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Lenght=" + Lenght +
                ", Width=" + Width +
                '}';
    }
}
