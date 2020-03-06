public class OverloadConstructorsMain {
	public static void main(String[] args) {
		OverloadConstructors obj = new OverloadConstructors();
		OverloadConstructors obj1 = new OverloadConstructors(3);
		OverloadConstructors obj2 = new OverloadConstructors(3,44);
		OverloadConstructors obj3 = new OverloadConstructors(3,44,58);
		obj2.extra();
	}
}
