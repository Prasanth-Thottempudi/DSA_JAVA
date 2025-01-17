package RECURSION;

public class P2RecursionPractiseQuestions {

    static void fun(int n){
        if(n==0) return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);

    }

    static void fun1(int n){
        if(n==0) return;
        fun1(n-1);
        System.out.println(n);
        fun1(n-1);
/*
    f(3)
    f(2)
    f(1)
    f(0)
    1
    2




 */
    }
    public static void main(String[] args) {

        fun1(3);
    }
}
