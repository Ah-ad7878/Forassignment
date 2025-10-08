package pk.org.cas.ForLoop;

import java.util.Scanner;

public class OddNaturalNumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = s.nextInt();
        int sum = 0;
//        int odd;

        for (int i=1; i<=number; i++) {
            if (i%2 != 0){
                System.out.println(i+" odd number");
                sum+=i;

            }

        }
        System.out.println("sum  = "+sum);

    }
}
