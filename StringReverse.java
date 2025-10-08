package pk.org.cas.ForLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value: ");
        String n = sc.nextLine();

       String reverse = " ";

        for (int i = n.length()-1;i>=0;i--){
            reverse+=n.charAt(i);
        }
        System.out.println(reverse.toLowerCase());
    }
}
