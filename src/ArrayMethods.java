public class ArrayMethods {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,7};
		change(arr);
		for(int x:arr)
			System.out.println(x);
	}
	public static void change(int arr[]) {
		for(int i=0; i<arr.length;i++)
			arr[i]+=5;
	}
}
