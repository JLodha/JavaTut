import java.util.Scanner;
public class MethodsAndInstancesMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MethodsAndInstancesClass gf = new MethodsAndInstancesClass("Melisa"); 
		System.out.print("Enter your girl friend name: ");
		String temp = input.nextLine();
		gf.Setname(temp);
		gf.statement();
		System.out.println(gf.getname());
		input.close();
	}
}
