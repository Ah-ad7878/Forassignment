package pk.org.cas.ForLoop;

import java.util.Scanner;

public class Diamond3 {
    public static void main(String[] args) {
        int start,end,mid,len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        len = sc.nextInt();
        start = end = mid= len/2;

        for (int row = 1;row<=len;row++){
            for (int columb  = 1;columb<=len;columb++){
                if (columb>=start &&  columb<=end){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            if (row <  mid){
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }

    }
}
