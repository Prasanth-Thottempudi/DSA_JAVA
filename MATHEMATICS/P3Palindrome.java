public class P3Palindrome {

	public static void main(String[] args) {
		int n=1111;

		int reverse=0;

		int temp=n;
		while (temp!=0) {
			int lastDigit=temp%10;
			reverse=reverse*10+lastDigit;
			temp=temp/10;
		}
		if(reverse==n){
			System.out.println("palindrome number");
		}else{
			
			System.out.println("not a palindrome number");
		}
	}
	
}
