public class ArrayTable {
	public static void main(String [] args) {
		System.out.println("Index\tElement");
		int arr[] = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"\t"+arr[i]);
		}
	}
}
