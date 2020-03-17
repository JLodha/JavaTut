import java.util.EnumSet;
public class EnumSets {
	public static void main(String [] args) {
		for(Enum people: EnumSet.range(Enum.reeta, Enum.ashok) )
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getAge());
	}
}
