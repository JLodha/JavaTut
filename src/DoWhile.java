public class DoWhile {
	public static void main(String [] args) {
		int counter =0;
		do {
			System.out.println(counter);
			counter++;
		}while(counter<=10);
		System.out.println("Value of counter after do-while finishes is "+counter);
	}
}
