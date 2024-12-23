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

    static void primeFactorsE(int n){
        if(n<=1) return ;
        while(n%2==0) {
            System.out.print(2 +" ");
            n=n/2;
        }

        while (n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for (int i=5;i<Math.sqrt(n);i=i+6){
            while (n%i==0) {
                System.out.print(i +" ");
                n=n/i;
            }
            while (n%(i+2)==0) {
                System.out.print(i+2 +" ");
                n=n/(i+2);
            }
        }
        if(n>3) System.out.print(n +" ");

    }

    public static void main(String[] args) {

        int n=84;

        primeFactorsE(n);

    }
}
