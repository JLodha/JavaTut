import java.util.Scanner;
public class Swtich {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		int age = ip.nextInt();
		
		switch(age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble with your activities");
			break;
		default:
			System.out.println("I don't know what you can achieve at this age. There are a lot of choices available for you to achieve. Good Luck for your future.");
		break;
		}
		ip.close();
	}
}
