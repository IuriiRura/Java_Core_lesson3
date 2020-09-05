package lesson9;

public class Application {

    public static void main(String[] args) throws MyException, IllegalAccessException {

        Methods my = new Methods(0, 0);
        my.summary();
        my.subtraction();
        my.multiply();
        my.divide();
    }

}
