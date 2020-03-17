public class UsingFinalMain {
	public static void main(String[] args) {
		UsingFinal obj = new UsingFinal(10);
		for(int i =0; i<5;i++) {
			obj.add();
			System.out.println(obj);
		}
	}
}
