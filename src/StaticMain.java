public class StaticMain {
	public static void main(String [] args) {
		Static obj1 = new Static("Janit","Lodha");
		Static obj2 = new Static("Ashok","Lodha");
		Static obj3 = new Static("Reeta","Lodha");
		
		System.out.println();
		System.out.println(obj1.getFirst());
		System.out.println(obj1.getLast());
		System.out.println(obj1.getMembers());
		System.out.println();
		System.out.println(Static.getMembers());
	}
}
