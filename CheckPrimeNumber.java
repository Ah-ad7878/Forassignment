package pk.org.cas.ForLoop;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check it is prime or not: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        for (int f = 2;f<=number/2;f++){
            if (number%f == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number+" number is prime");
        }else {
            System.out.println(number+" is not prime");
        }
    }
}
