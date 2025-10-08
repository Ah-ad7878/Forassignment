package pk.org.cas.ForLoop;

import java.util.Scanner;

public class DigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rem = 0;
        int count = 0;
        int reverse = 0;

        for (;n>=1;n/=10){
            rem = n%10;
            reverse = reverse*10+rem;
            count++;

        }
        System.out.println("Reverse = "+reverse);
        System.out.println(count);
    }
}
