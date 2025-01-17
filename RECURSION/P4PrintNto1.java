package RECURSION;

public class P4PrintNto1 {

    static void recursiveCall(int n){
        if(n==0) return;
        System.out.println(n);
        recursiveCall(n-1);
    }
    public static void main(String[] args) {

        recursiveCall(5);


    }
}
