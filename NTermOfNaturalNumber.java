package pk.org.cas.ForLoop;

import java.util.Scanner;

public class NTermOfNaturalNumber {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (i=1; i<=number;i++){
            System.out.println("natural number "+i);
            sum+=i;
        }
        System.out.println("sum of natural number = "+sum);
    }
}
