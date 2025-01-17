package RECURSION;

public class P3PractiseQuestionsPart2 {

    static int fun(int n){
        if(n==1) return 0;
        return 1+fun(n/2);

    }

    static void fun1(int n){
        if(n==0) return ;
        fun1(n/2);
        System.out.println(n%2);

          /*
        f(7)
        f(3)
        f(1)
        1
        1
        1
         */
    }


    public static void main(String[] args) {

//        System.out.println(fun(17));

        fun1(7);
        // prints the binary equivalent number of a decimal
//        after reversing that binary equivalent number



    }
}
