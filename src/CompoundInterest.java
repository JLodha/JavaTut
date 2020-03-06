public class CompoundInterest {
	public static void main(String [] args) {
		//Scanner year = new Scanner(System.in);
		//int n = year.nextInt();
		int n = 3;
		//year.close();
		double amount,rate = 0.01; //Rate is assumed to be 1 percent
		double principal=10000;
		amount = principal;
		double mult = (1+rate);
		for(int i=0;i<n;i++) {
			amount = amount*mult;
		}
		System.out.println("Final number of subscribers is "+amount);
	}
}
