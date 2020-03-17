public enum Enum {
	janit("student","18"),
	reeta("mother","40"),
	ashok("father","45");
	
	private final String description;
	private final String age;
	Enum (String desc, String year) {
		description = desc;
		age = year;
	}
	
	public String getDesc() {
		return description;
	}
	
	public String getAge() {
		return age;
	}
}
