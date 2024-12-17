package MATHEMATICS;

public class P6LCM {

    static int gcdAl(int a,int b){
        if (b==0) return a;
        return gcdAl(b,a%b);
    }


    public static void main(String[] args) {

        int a=4;
        int b=6;

        int lcm=a*b/gcdAl(a,b);
        System.out.println(lcm);


    }
}
