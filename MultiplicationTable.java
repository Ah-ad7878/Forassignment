package pk.org.cas.ForLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    int multi;

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i=1; i<=10; i++){
            multi = number*i;
        System.out.println(number+" * "+i+" = "+multi);
        }

    }

}
