package Assigment_No_1;

import java.util.Scanner;

public class Addition_Of_Two_Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter First Number : ");
        int a = scan.nextInt();

        System.out.println(" Enter Second Number: ");
        int b = scan.nextInt();

        int Addition = a + b;

        System.out.println(" Addtion of these two number is : "  + Addition);

    }
}
