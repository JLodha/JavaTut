public class EnhancedForLoop {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int sum=0;
		for(int x:arr) {
			sum+= x;
		}
		System.out.println("The sum of array 'arr' is "+sum);
	}
}
