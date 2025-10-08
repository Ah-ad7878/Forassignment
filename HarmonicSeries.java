package pk.org.cas.ForLoop;

public class HarmonicSeries {
        private int n;


        public void setN(int n){
            this.n = n;
        }
        public int getN(){
            return n;
        }

        public HarmonicSeries(){

        }
        public HarmonicSeries(int n){
            this.n = n;
        }

        public void checkHarmonicSeries(){
            float sum = 0.0f;
            for (int i = 1;i<=getN();i++){
                sum+=1.0f/i;
            }
        System.out.println("sum of harmonic series "+n+" is "+sum);
    }
}
