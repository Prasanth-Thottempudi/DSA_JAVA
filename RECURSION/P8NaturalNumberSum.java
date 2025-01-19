package RECURSION;

public class P8NaturalNumberSum {

    static int naturalNmSum(int n){
        if(n==0){
            return 0;
        }
        return n+naturalNmSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(naturalNmSum(3));

    }
}
