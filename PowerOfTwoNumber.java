package pk.org.cas.ForLoop;

import java.util.Scanner;

public class PowerOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int power = 1;


        for (int i = 1;i<=2;i++){
            System.out.print("Enter a number "+i+" : ");
            int n = sc.nextInt();
            power *= n;

        }
        System.out.println("Power of Two number  = "+power);
    }
}
