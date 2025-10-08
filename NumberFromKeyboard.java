package pk.org.cas.ForLoop;

import java.util.Scanner;

public class NumberFromKeyboard {
    public static void main(String[] args) {
    int number;
    int sum = 0;
    int i;
    int num;
    int average = 0;

    Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        number = sc.nextInt();

        for (i=1; i<=10;i++){
            System.out.print("Enter a number"+i+" : ");
             num = sc.nextInt();
             sum+=num;
             average = sum/10;
        }
        System.out.println("sum of the number = "+sum);
        System.out.println("average = "+average);


    }

}
