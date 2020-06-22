package com.lgs.lab.Interface2;

import com.lgs.lab.Interface1.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {


    double a;


    double b;


    public MyCalculator(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public void devide() {
        double c = a / b;
        System.out.println("result for devide is " + c);

    }

    @Override
    public void minus() {
        double c = a - b;
        System.out.println("result for minus is " + c);

    }

    @Override
    public void multipy() {
        double c = a * b;
        System.out.println("result for multiply is " + c);

    }

    @Override
    public void sum() {
        double c = a + b;
        System.out.println("result for sum is " + c);

    }
}
