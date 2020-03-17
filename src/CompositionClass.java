public class CompositionClass {
	private String myname;
	private ToString birthdate;
	
	public CompositionClass(String name, ToString date) {
		myname = name;
		birthdate = date;
	}
	
	public String toString() {
		return String.format("My name is %s,and my birthday is on %s",myname, birthdate);
	}
}
