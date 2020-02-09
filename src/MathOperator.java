import java.util.Scanner;
public class MathOperator {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		int a,b,add,sub,mult,div,mod;
		a = num.nextInt();
		b = num.nextInt();
		sub = a-b;
		add = a+b;
		mult = a*b;
		div = a/b;
		mod = a%b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(mod);
		num.close();
	}
}
