public class P5GCD {

    static int gcdUsingEucliedsAlg(int a,int b){
        if(b==0) return a;
        return gcdUsingEucliedsAlg(b,a%b);
    }
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int gcd=gcdUsingEucliedsAlg(a,b);
        System.out.print(gcd);

    }
}
