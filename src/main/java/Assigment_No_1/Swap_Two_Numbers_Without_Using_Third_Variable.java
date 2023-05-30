package Assigment_No_1;

public class Swap_Two_Numbers_Without_Using_Third_Variable {

    public static void main(String[] args) {

        int a = 10, b = 20;

        // Add 'a' and 'b' and store its value in 'a', now value of 'a' will be 30.

        a = a + b;


        // Subtract 'b' from 'a' and store its value in 'b', now value of 'b' will be 10.

        b = a - b;

        // Again subtract 'b' from 'a' and store its value in 'a', now value 'a' will be 20.

        a = a - b;

        System.out.println(" Value of 'a' is : " + a);

        System.out.println(" Value of 'b' is : " + b);



    }
}
