public class P5GCD {

    public static void main(String[] args) {

        int a=10;
        int b=15;
        int min;
        int gcd=1;
        if(a<b) {
            min = a;
        }else{
            min=b;
        }
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0) gcd=i; break;
        }
        System.out.print(gcd);
    }
}
