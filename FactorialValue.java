package pk.org.cas.ForLoop;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = sc.nextInt();


        int factorial = 1;

        for (int i = 1;i<=number;i++){
            factorial *= i;
        }
        System.out.println("factorial of "+number+" is "+factorial);
    }
}
