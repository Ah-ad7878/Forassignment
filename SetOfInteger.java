package pk.org.cas.ForLoop;

import java.util.Scanner;

public class SetOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number by which which you take set of integer: ");
        int set = sc.nextInt();

        int even = 0;
        int odd = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1;i<=set;i++){
            System.out.print("Enter a number "+i+" : ");
            int n = sc.nextInt();

            if (n%2 == 0) {
                even++;
                evenSum += n;
            }
            else {
                    odd++;
                   oddSum+=n;
            }


        }
        System.out.println("odd = "+odd);
        System.out.println("even number = "+even);
        System.out.println("Even sum = "+evenSum);
        System.out.println("odd sum = "+oddSum);
    }
}
