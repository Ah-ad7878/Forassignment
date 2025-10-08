package pk.org.cas.ForLoop;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = n;
        int reverse = 0;

        for (;number>0;number/=10){
            int reminder = number%10;
            reverse = reverse*10+reminder;

        }
            System.out.println(reverse);

        if (reverse==n){
            System.out.println("it is  palindrome number");
        }else {
            System.out.println("it is not palindrome number");
        }

    }
}
