package MATHEMATICS;

public class P9AllDivisors {

    static void printDivisorsB(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }

    static void printDivisorsE(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i) n=n/i;
            }
        }
    }

    public static void main(String[] args) {


        int n=25;
        printDivisorsE(n);
    }
}
