public class TimeClassMain {
	public static void main(String [] args) {
		TimeClass obj = new TimeClass();
		System.out.println(obj.toMilitary());
		System.out.println(obj.toRegular());
		obj.set(15, 15, 36);
		System.out.println(obj.toMilitary());
		System.out.println(obj.toRegular());
	}
}
