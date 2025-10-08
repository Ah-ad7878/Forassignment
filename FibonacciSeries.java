package pk.org.cas.ForLoop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0,b = 1,c;

        for (int g = 0;g<=n;g++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
