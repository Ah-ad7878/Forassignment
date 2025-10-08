package pk.org.cas.ForLoop;

import java.util.Scanner;

public class SumOfSeriesOf9 {
    public static void main(String[] args) {
        long t= 9;
        int i;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a term you want to print: ");
        int n = sc.nextInt();

        for ( i = 1;i<=n;i++){
            sum+=t;
            System.out.println("series of 9 =  "+t);
            t = t*10+9;
        }
        System.out.println("sum = "+sum);
    }
}
