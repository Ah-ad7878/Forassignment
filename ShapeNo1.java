package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ShapeNo1 {
    public static void main(String[] args) {
        int start,end,mid,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
         n = sc.nextInt();

        start = mid = end = n/2+1;
        for (int i = 1;i<=mid;i++){
            for (int j = 1;j<=n;j++){
                if (j>=start && j<=end){
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }
            }
            System.out.println();
            start--;
            end++;

        }

//        for (int i = 1;i<=n;i++){
//            for (int j = 1;j<=2*n-1;j++){
//                if (j>=(n-i+1) && j<=(n+i-1)){
//                    System.out.print("8");
//                }else {
//
//                System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
