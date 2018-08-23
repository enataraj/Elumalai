import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",","{","}");
		joiner.add("Elumalai");
		joiner.add("Nishanth");
		joiner.add("Test");
		System.out.println(joiner.toString());
		System.out.println(joiner.length());
	}

}
