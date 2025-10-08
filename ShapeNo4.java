package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ShapeNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

//        for (int i =number;i>=1;i--){
//            for (int j = 1;j<=number;j++){
//                if (j<=number-i){
//                    System.out.print(" ");
//                }else {
//                   System.out.print("*");
//
//                }
//            }
//            System.out.println();
//        }


        for (int f= number;f>=1;f--){
            for (int s = 1;s<=f;s++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }












}
