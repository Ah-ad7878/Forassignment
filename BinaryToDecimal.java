package pk.org.cas.ForLoop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

    Scanner sc  =new Scanner(System.in);
        System.out.print("Enter a binary Number in the form of  and 1: ");
        int binary = sc.nextInt();

        int reminder;
        int decimal = 0;
        int pv = 1;
        int n = binary;
        for (;n>0;n/=10){
            reminder = n%10;
            decimal = decimal+pv*reminder;
            pv = 2*pv;
        }
        System.out.println("Decimal number of"+binary+" = "+decimal);


    }

}
