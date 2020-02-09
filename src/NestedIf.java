public class NestedIf {
	public static void main(String[] args) {
		int age = 60;
		if(age<50) {
			System.out.println("You are still young!");
		}
		else {
			System.out.println("You are old");
			if(age>75){
				System.out.println("You are seriously an old men");
			}
			else {
				System.out.println("Don't worry you are still not that much old");
			}
		}
	}
}
