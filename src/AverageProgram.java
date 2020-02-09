import java.util.Scanner;
public class AverageProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		double total=0;
		int count =0;
		while(count<10) {
			number = input.nextInt();
			total = total + number;
			count++;
		}
		input.close();
		total = total/10;
		System.out.println(total);
	}
}
