package com.ansary;

import java.util.Scanner;

public class SumOfIntegers {

    public static long naturalSum(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        System.out.println(naturalSum(n));
    }
}
