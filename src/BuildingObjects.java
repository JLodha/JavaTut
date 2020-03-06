
public class BuildingObjects {
	public static void main(String[] args) {
		SetGetClass obj = new SetGetClass();
		SetGetClass obj1 = new SetGetClass(5);
		SetGetClass obj2 = new SetGetClass(5,13);
		SetGetClass obj3 = new SetGetClass(5,13,44);
		
		System.out.printf("%s\n",obj.toMilitary());
		System.out.printf("%s\n",obj1.toMilitary());
		System.out.printf("%s\n",obj2.toMilitary());
		System.out.printf("%s\n",obj3.toMilitary());
	}
}
