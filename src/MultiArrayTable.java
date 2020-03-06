public class MultiArrayTable {
	public static void main(String [] args) {
		int firstarray[][] = {{1,2,3,4},{5,6,7,8}};
		int secondarray[][] = {{1,2,3,4},{43},{5,6,7,8,9,10}};
		System.out.println("This is first array:");
		display(firstarray);
		System.out.println("This is second array:");
		display(secondarray);
	}
	public static void display(int arr[][]) {
		System.out.println("Row\tColumn\tElement");
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(i+"\t"+j+"\t"+arr[i][j]);
			}
			System.out.println("*ROW CHANGE*");
		}
	}
}
