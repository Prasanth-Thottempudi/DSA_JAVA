public class P1CountDigits {

	public static void main(String[] args) {
		
		int digits=1223;
		int count=0;
		while (digits!=0) {
			digits=digits/10;
			count++;			
		}
		System.out.println(count);
	}
	
}
