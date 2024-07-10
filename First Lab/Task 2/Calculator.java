package com.ansary;
import  java.util.Scanner;

public class Calculator {

    public static double sum(double x, double y){
        return x+y;
    }

    public static double subtract(double x, double y){
        return x-y;
    }

    public static double multiply(double x, double y){
        return x*y;
    }

    public static double divide(double x, double y) throws ArithmeticException {
        if (y == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return x / y;
    }

    public static void main(String[] args) {

        System.out.println("How to use this very basic calculator?");
        System.out.println("Example:\n5\n+\n10");
        System.out.println("Enter the operand in the following format above:");
        Scanner sc = new Scanner(System.in);

        char operand;
        double x, y;
        x = sc.nextDouble();
        operand = sc.next().charAt(0);
        y = sc.nextDouble();

        double result = 0.0;
        if (  operand == '+')
            result = sum(x,y);

        else if ( operand == '-')
            result = subtract(x,y);

        else if ( operand == '*')
            result = multiply(x,y);

        else if (operand == '/') {
            try {
                result = divide(x, y);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }

        System.out.println(x + " " + operand + " " + y + " = " + result);
    }
}
