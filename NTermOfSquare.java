package pk.org.cas.ForLoop;

import java.util.Scanner;

public class NTermOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int square;

        for (int i = 1;i<=n;i++){
            square = i*i;
            System.out.println("square of a number "+i+" is "+square);
            sum+=square;
        }
        System.out.println("sum of Square of a number "+sum);
    }
}
