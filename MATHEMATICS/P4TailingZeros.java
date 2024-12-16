public class P4TailingZeros {
	public static void main(String[] args) {
		
		 int n=20;
		 int fact=1;
		 for(int i=2;i<=n;i++){
		 	fact=fact*i;
		 }
		 int count=0;
		 while (fact%10==0) {
		 	count++;
		 	fact=fact/10;
		 }
		 System.out.println(count);

//		 time complexity is more in this case
//		 efficient way


		int res=0;
		for(int i=5;
			i<=n;
			i=i*5){
			res=res+n/i;
		}
		System.out.println(res);
		


	}
	
}
