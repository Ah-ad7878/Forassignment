package pk.org.cas.ForLoop;

public class NumberBetween100And200 {
    public static void main(String[] args) {
//        int number = 200;
        int sum = 0;

        for (int i = 100;i<=200;i++){
           if (i%9 == 0){
               System.out.println("divider of 9 between 100 to 200  = "+i);
               sum+=i;
           }
        }
        System.out.println("sum of divider of 9 = "+sum);
    }
}
