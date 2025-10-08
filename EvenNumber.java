package pk.org.cas.ForLoop;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1;i<=number;i++){
            if (i%2==0){
                System.out.println(i+" is odd number");
                sum+=i;
            }
        }
        System.out.println("sum of odd number is "+sum);
    }
}
