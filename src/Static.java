public class Static {
	private String first;
	private String last;
	private static int member=0;
	
	public Static(String fn, String sn) {
		first = fn;
		last = sn;
		member++;
		System.out.printf("The constructor for this object %s %s, is having %d members.\n",first,last,member);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return member;
	}
}
