package Assigment_No_1;

public class Swap_Two_Numbers_Using_Third_Variable {

    public static void main(String[] args) {

        int a = 10, b = 20;
        int c;

        // Value of 'a' is now store in 'c' that means value of 'c' will be 10.

        c = a;

        // Value of 'b' is now store in 'a' that means value of 'a' will be 20.

        a = b;

        // Value of 'c' is now store in 'b' that mens value of 'b' will be 10.

        b = c;

        System.out.println(" Value of 'a' is : " + a);

        System.out.println(" Value of 'b' is : " + b);

    }
}
