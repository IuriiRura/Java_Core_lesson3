package com.lgs.lab.Interface2;

public class Application {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator(12.3, 3.5);
        calc.devide();
        calc.multipy();
        calc.sum();
        calc.minus();

        for (String arg : args) {
            
        }
    }
}
