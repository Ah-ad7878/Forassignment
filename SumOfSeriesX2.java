package pk.org.cas.ForLoop;

import java.util.Scanner;

public class SumOfSeriesX2 {
    public double factorial(double n){
        double fact = 1;
        for (double i = 1;i<=n;i++){
            fact*=1;
        }
        return fact;
    }

   public void sumOfSeries2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a term: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        double sum = 0.0;

        for (double i=1;i<=n;i++){

            sum+= Math.pow(x,i)/factorial(i);
        }
        System.out.println(sum);
    }
}
