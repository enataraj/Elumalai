/*
 * Enumaration data type example
 */
public class EnumTest {
public static void main(String[] args) {
	Season s = Season.WINTER;
	System.out.println(s.getValue());
	s.setValue(10);
	
	
	System.out.println("Season ->  "+s.getValue());
	
	for(Season ss : Season.values()){
		System.out.println(ss.getValue());
		ss.addNumber();
		ss.weatherCondition();
	}
}
}
