package RECURSION;




public class P11RopeCutting {

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int maxPieces(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res=max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c));
        if(res==-1)
            return -1;
        return res+1;

    }

    public static void main(String[] args) {

        System.out.println(maxPieces(23,11,12,9));
    }
}
