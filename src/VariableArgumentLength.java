public class VariableArgumentLength {
	public static void main(String[] args) {
		System.out.println(average(1,2,3,4,5,6,7,8,9,10));
	}
	public static double average(int...numbers) {
		double total =0;
		for(int i:numbers)
			total+=i;
		return total/numbers.length;
	}
}
