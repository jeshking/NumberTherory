package com.jeshwanth;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String args[]){
        long num;
        System.out.println("Enter an Interger:");
        Scanner input = new Scanner(System.in);
        num = input.nextLong();
        if( num % 2 ==0)
        System.out.println("Entered Number is Even Number");
        else
            System.out.println("Enter Number is Odd Number");


    }
}
