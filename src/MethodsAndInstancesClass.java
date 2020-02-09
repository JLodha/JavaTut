
public class MethodsAndInstancesClass {
	private String girlname;
	public MethodsAndInstancesClass(String name) {
		girlname = name;
	}
	public void Setname(String name) {
		girlname = name;
	}
	public String getname() {
		return girlname;
	}
	public void statement() {
		System.out.printf("Your girlfriend name was %s",girlname);
		System.out.println("");
	}
}
