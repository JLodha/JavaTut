
public class Composition {
	public static void main (String [] args) {
		ToString obj1 = new ToString(4,5,6);
		CompositionClass obj2 = new CompositionClass("Janit", obj1);
		System.out.println(obj2);
	}
}
