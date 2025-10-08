package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ArithmeticProgressionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int term = 1;

        for (int i = 1;i<=n;i++){

            term = term*2;
            System.out.println(term);
            sum+=term;
        }
        System.out.println("sum of number= "+sum);
    }
}
