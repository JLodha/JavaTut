
public class ToString {
	private int month;
	private int day;
	private int year;
	
	public ToString(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this class has set up the date as %s\n",this);
	}
	//this will point to toString always so dont use this function name
	public String toString() {
		return String.format("%d/%d/%d",month,day,year);
	}
}
