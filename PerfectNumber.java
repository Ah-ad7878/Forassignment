package pk.org.cas.ForLoop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i;

        for (i = 1;i<n;i++){
            if (n%i == 0){
                System.out.println(i);
                sum+=i;
            }
        }
                if (sum==n){
                    System.out.println(n+"  is perfect ");
                }else {
                    System.out.println(n+ " is not perfect");
                }
    }
}
