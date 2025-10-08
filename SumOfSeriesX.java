package pk.org.cas.ForLoop;

import java.util.Scanner;

public class SumOfSeriesX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        double sum = 0.0;

        for (int i =1;i<=number;i++){
            sum+= Math.pow(x,2*i+1);
        }
        System.out.println("sum of series start from (x+x^3+x^5+...) to n term = "+sum);


    }
}
