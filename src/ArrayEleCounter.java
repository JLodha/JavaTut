import java.util.Random;
public class ArrayEleCounter {
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int[7];
		for(int i=1;i<1000;i++){
			++freq[1+rand.nextInt(6)];
		}
		System.out.println("Face\tValue");
		for(int face =1;face<7;face++)
			System.out.println(face+"\t"+freq[face]);
	}
}
