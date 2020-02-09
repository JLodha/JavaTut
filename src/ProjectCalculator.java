import java.util.Scanner;
public class ProjectCalculator {
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in);
		double number1,number2,result;
		System.out.print("Enter first number: ");
		number1 = number.nextDouble();
		System.out.print("Enter second number: ");
		number2 = number.nextDouble();
		result = number1+number2;
		System.out.println(result);
		number.close();
	}
}
