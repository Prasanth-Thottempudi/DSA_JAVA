public class P2Factorial {
	
	static int recursiveFactorial(int n){
			if(n==0){
				return 1;
			}
			return n*recursiveFactorial(n-1);
		}
	
		public static void main(String[] args) {
			int n=4;
			int fact=1;
			for(int i=2;i<=n;i++){
				fact=fact*i;
			}
			System.out.println(fact);
	
			System.out.println(recursiveFactorial(n));
	}
}
