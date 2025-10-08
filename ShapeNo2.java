package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ShapeNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = sc.nextInt();

        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int f = 1;f<=row;f++){
            for (int s = 1;s<=row;s++){

                if (s<=row-f){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }


    }
}

