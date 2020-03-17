public class UsingFinal {
	private int sum=0;
	public final int NUMBER;
	
	public UsingFinal(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	
	public String toString() {
		return String.format("summation = %d", sum);
	}
}
