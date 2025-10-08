package pk.org.cas.ForLoop;

import javax.swing.*;
import java.util.Scanner;

public class VerticalTable {
    public static void main(String[] args) {
    int multi;

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i<=number; i++){
          for (int j = 1; j<=10;j++){
              multi = i*j;
              System.out.println(i+" * "+j+" = "+multi);
          }
            System.out.println();

        }

    }

}
