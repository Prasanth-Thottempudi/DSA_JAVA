package MATHEMATICS;

public class P8PrimeFactors {

    static void primeFactorsB(int n){
        if(n<1) return;
        for(int i=2;i<=Math.sqrt(n);i++){
            while (n%i==0){
                System.out.print(i+"* ");
                n=n/i;
            }
        }
        if(n>1) System.out.println(n);
    }

    public static void main(String[] args) {

        int n=84;

        primeFactorsB(n);

    }
}
