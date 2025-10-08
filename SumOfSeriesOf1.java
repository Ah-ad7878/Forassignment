package pk.org.cas.ForLoop;

public class SumOfSeriesOf1 {

    private int number;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public SumOfSeriesOf1(){

    }
    public SumOfSeriesOf1(int number){
        this.number = number;
    }

    public void sumOfSeries(){
        int t = 1;

        int sum = 0;
        for (int i =0;i<=number;i++) {
            t = t * 10 + 1;
            System.out.println("series of 1 =  " + t);
            sum+=t;
        }
        System.out.println("Sum = "+sum);
    }
}
