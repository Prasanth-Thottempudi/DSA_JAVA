package MATHEMATICS;

public class P7PrimeNumber {

    static boolean isPrime(int n){
        if(n==2 || n==3){
            return true;
        }
        for(int i=2;i<=Math.sqrt(100);i++){
            if(n%i==0) return false;
        }
        return true;
    }

//    efficient method
static boolean isPrimeE(int n) {
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i= 5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
    }
        return true;
}
    public static void main(String[] args) {
        int n=6;
        boolean isPrime=isPrimeE(n);
        System.out.println(isPrime);

    }
}
