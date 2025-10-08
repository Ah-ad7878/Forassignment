package pk.org.cas.ForLoop;

import java.util.Scanner;

public class SumOfSeriesX3 {

    public double factorial(double n){
        double factorial = 1;
        for (double i = 1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public void SumOfSeries3(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a term: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();


        double sum = 1.0;


        for (double i = 1;i<=n;i++){
            double exponent = 2*i;
            double term =  Math.pow(x,exponent)/factorial(exponent);
            if (i%2!=0){
                term = -term;
            }
            sum+=term;


        }
        System.out.println("Sum of the series = "+sum);
    }
}
