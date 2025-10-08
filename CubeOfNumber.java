package pk.org.cas.ForLoop;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        int number;
        int i;
        int cube = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (i=1;i<=number;i++){
            cube = number*number*number;
        }
        System.out.println("cube of the number is "+cube);
    }
}
