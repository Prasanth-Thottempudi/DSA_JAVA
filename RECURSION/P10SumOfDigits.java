package RECURSION;

public class P10SumOfDigits {

    static  int getSum(int number){
        if(number<=0) return 0;
        return (number%10)+getSum(number/10);
    }
    public static void main(String[] args) {

        System.out.println(getSum(311));
    }
}
