package pk.org.cas.ForLoop;

import java.util.Scanner;

public class ShapeQno5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int row = 1;row<=n;row++){
            for (int columb = 1;columb<=n;columb++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
