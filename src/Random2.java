import java.util.Random;
public class Random2 {
	public static void main(String[] args) {
		Random dice = new Random();
		for(int i =0;i<10;i++)
			System.out.println(1+dice.nextInt(6));
	}
}
