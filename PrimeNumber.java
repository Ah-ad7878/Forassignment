package pk.org.cas.ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //this is a scanner class use for take input

        System.out.print("Enter a number which want you check sum: ");   //take a number by user which we want to check its sum equal to prime numbers
        int n = sc.nextInt();

        int sum = 0;
//        boolean allPrime = true;
        boolean isPrime = true;
        int prime = 0;

        for (int f = 1; f <=2 ; f++) {
            System.out.print("Enter prime number " + f + " : ");
            prime = sc.nextInt();


            for (int j = 2;j<=Math.sqrt(prime);j++){
                if (prime%j == 0){
                    isPrime = false;
                    break;
                }
            }
        if (isPrime){
            System.out.println(prime+" is prime number");
            sum+=prime;
        }else {
            System.out.println("is not prime number");
        }
        }

        if ( sum == n){
            System.out.println(sum+" made by two prime numbers");
        }
        else  {
            System.out.println("sum is not made by prime number");
        }

    }
}
