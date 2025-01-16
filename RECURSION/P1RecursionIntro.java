package RECURSION;

public class P1RecursionIntro {

    static  void recursiveCall(int n){
        if(n==0) {
            return;
        }
        System.out.println("recursive call");
        recursiveCall(n-1);
    }
    public static void main(String[] args) {
        recursiveCall(5);

    }
}
