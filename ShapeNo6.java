package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ShapeNo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int start,mid,end;
        start=end=mid=number/2;

        for (int i = 1;i<=mid;i++){
            for (int j=1;j<=number;j++){
                if (j>=start&&j<=end){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start--;
            end++;
        }

    }
}
