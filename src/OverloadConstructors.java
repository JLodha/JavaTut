public class OverloadConstructors {
	private int hour;
	private int minute;
	private int second;
	
	public OverloadConstructors() {
		this(0,0,0);
	}
	public OverloadConstructors(int h) {
		this(h,0,0);
	}
	public OverloadConstructors(int h, int m) {
		this(h,m,0);
	}
	public OverloadConstructors(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h,int m, int s) {
		hour = ((h>=0 && h<24)?h:0);
		minute = ((m>=0 && m<60)?m:0);
		second = ((s>=0 && s<60)?s:0);
		print();
	}
	private void print() {
		System.out.println(String.format("%d:%02d:%02d",hour,minute,second));
	}
	public void extra() {
		System.out.println("Extra testing "+ hour);
	}
}
