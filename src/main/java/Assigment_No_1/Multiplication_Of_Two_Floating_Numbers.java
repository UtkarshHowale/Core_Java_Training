package Assigment_No_1;

import java.util.Scanner;

public class Multiplication_Of_Two_Floating_Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter First Number : ");
        float a = scan.nextFloat();

        System.out.println(" Enter Second Number : ");
        float b = scan.nextFloat();

        float Multiply = a * b;

        System.out.println(" Multiplication of these two number is : " + Multiply);

    }
}
