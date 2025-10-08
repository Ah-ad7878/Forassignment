package pk.org.cas.ForLoop;

import java.util.Scanner;

public class NumberInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int reminder;
        int reverse=0;

        int number = num;

        for (;number>0;number/=10){
            reminder  = number%10;

            reverse = reverse*10+reminder;

        }
        System.out.println("Reverse of a number is "+reverse);
    }
}
