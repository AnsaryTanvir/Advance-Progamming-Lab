package com.ansary;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args){
        int numbers[] = { 5,1,7,9,4,6};
        Arrays.sort(numbers);
        System.out.println("Min: " + numbers[0]);
        System.out.println("Max: " + numbers[numbers.length -1 ]);
    }

}
