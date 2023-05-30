package Assigment_No_1;

import java.util.Scanner;

public class Check_Number_Is_Even {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println(" Enter Your Number : ");

        int a = scan.nextInt();

        if (a % 2 == 0){

            System.out.println(" Number is Even ");

        }
        else {

            System.out.println(" Number is Odd ");

        }
    }
}
