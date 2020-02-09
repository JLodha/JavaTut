import java.util.Scanner;
public class MethodsWithParametersMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MethodsWithParametersClass print = new MethodsWithParametersClass ();
		
		System.out.println("Enter your fucking name: ");
		String name = input.nextLine();
		print.SimpleMessage(name);
		input.close();
	}
	
}
