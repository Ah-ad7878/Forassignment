package pk.org.cas.ForLoop;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i=1; i<=10; i++){
            System.out.println("Natural number "+i);
            sum += i;
        }
            System.out.println("sum opf natural number "+sum);
    }
}
