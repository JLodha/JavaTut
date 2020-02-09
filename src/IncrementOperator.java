public class IncrementOperator {
	public static void main(String args[]) {
		int tuna=5,bass=3,fish=2,dog=6,cat=97;
		++tuna;
		System.out.println(tuna++);
		System.out.println(tuna);
		--tuna;
		System.out.println(tuna);
		bass = bass +3;
		System.out.println(bass);
		bass += 4;
		System.out.println(bass);
		fish -= 1;
		System.out.println(fish);
		dog *= 3;
		System.out.println(dog);
		cat %= 3;
		System.out.println(cat);
	}
}
