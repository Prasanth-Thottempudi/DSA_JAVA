package RECURSION;

public class P7WritingBaseCases {

    static int fact(int n){
        if ( n==1) return 1;
        return n*fact(n-1);
    }

    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }


    public static void main(String[] args) {

//        System.out.println(  fact(5));

        System.out.println(fib(3));

    }
}
