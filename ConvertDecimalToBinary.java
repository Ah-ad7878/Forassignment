package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int decimalNumber = sc.nextInt();

        int reminder;
        String st = "";

        int n = decimalNumber;


        for (;n>0;n/=2){
            reminder = n%2;

            st = reminder+st;
        }
        System.out.println("Binary number of "+decimalNumber+" = "+st);
    }
}
