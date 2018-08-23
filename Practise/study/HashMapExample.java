package study;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		// first time when the key is not associated it will retrun null , if it
		// has any value it will return old value.
		Map<String, Integer> map = new HashMap<>();
		Integer s = map.put("Elumalai", 1);

		System.out.println("s " + s);

		Integer s1 = map.put("Elumalai", 2);
		System.out.println("s1 :" + s1);
		Integer s2 = map.put("Elumalai", 3);
		System.out.println("s1 :" + s2);
	}

}
