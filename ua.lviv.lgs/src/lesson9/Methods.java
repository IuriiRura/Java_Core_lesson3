
package lesson9;

public class Methods {
    private int firstArgument;
    private int secondArgument;

    public Methods(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    void summary() throws MyException, IllegalAccessException {
        if ((firstArgument < 0.0) && (secondArgument < 0.0)) {
            String message = "both elements are less than 0";
            throw new IllegalArgumentException(message);

        }
        else if (((firstArgument == 0) && (secondArgument!=0)) || ((firstArgument!=0)&&(secondArgument==0))) {
            String message = "one of the entered arguments is 0";
            throw new ArithmeticException(message);
        }
        else if ((firstArgument == 0) && (secondArgument == 0)){
            String message = "both elements are 0";
            throw new IllegalAccessException(message);
        }
        else if ((firstArgument > 0) && (secondArgument > 0)) {
            String message = "FATAL ERROR: you have entered correct data";
            throw new MyException(message);
        }
            else {
            System.out.println("summary result is " + (this.firstArgument + this.secondArgument));
        }
    }

    void subtraction() throws MyException, IllegalAccessException {
        if ((firstArgument < 0.0) && (secondArgument < 0.0)) {
            String message = "both elements are less than 0";
            throw new IllegalArgumentException(message);

        }
        else if (((firstArgument == 0) && (secondArgument!=0)) || ((firstArgument!=0)&&(secondArgument==0))) {
            String message = "one of the entered arguments is 0";
            throw new ArithmeticException(message);
        }
        else if ((firstArgument == 0) && (secondArgument == 0)){
            String message = "both elements are 0";
            throw new IllegalAccessException(message);
        }
        else if ((firstArgument > 0) && (secondArgument > 0)) {
            String message = "FATAL ERROR: you have entered correct data";
            throw new MyException(message);
        }
        else {
        }
        System.out.println("subtraction result  is " + (this.firstArgument
                - this.secondArgument));
    }

    void multiply() throws MyException, IllegalAccessException {
        if ((firstArgument < 0.0) && (secondArgument < 0.0)) {
            String message = "both elements are less than 0";
            throw new IllegalArgumentException(message);

        }
        else if (((firstArgument == 0) && (secondArgument!=0)) || ((firstArgument!=0)&&(secondArgument==0))) {
            String message = "one of the entered arguments is 0";
            throw new ArithmeticException(message);
        }
        else if ((firstArgument == 0) && (secondArgument == 0)){
            String message = "both elements are 0";
            throw new IllegalAccessException(message);
        }
        else if ((firstArgument > 0) && (secondArgument > 0)) {
            String message = "FATAL ERROR: you have entered correct data";
            throw new MyException(message);
        }
        else {
            System.out.println("multiply result is " + (this.firstArgument * this.secondArgument));
        }
    }
    void divide () throws MyException, IllegalAccessException {
            if ((firstArgument < 0.0) && (secondArgument < 0.0)) {
                String message = "both elements are less than 0";
                throw new IllegalArgumentException(message);

            }
            else if (((firstArgument == 0) && (secondArgument!=0)) || ((firstArgument!=0)&&(secondArgument==0))) {
                String message = "one of the entered arguments is 0";
                throw new ArithmeticException(message);
            }
            else if ((firstArgument == 0) && (secondArgument == 0)){
                String message = "both elements are 0";
                throw new IllegalAccessException(message);
            }
            else if ((firstArgument > 0) && (secondArgument > 0)) {
                String message = "FATAL ERROR: you have entered correct data";
                throw new MyException(message);
            }
            else {

                System.out.println("divide result is " + (this.firstArgument / this.secondArgument));
            }
        }
    }
