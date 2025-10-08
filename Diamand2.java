package pk.org.cas.ForLoop;

import java.util.Scanner;

public class Diamand2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number for making a diamond: ");
        n= sc.nextInt();

        for (int  i =-n+1 ;i<=n ; i++){
            for (int j = 1;j<=2*n-1;j++){
                if (j>Math.abs(i) && j<=(2*n-i-1) && j<=(2*n+i-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
