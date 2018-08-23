package list;

import java.util.LinkedHashMap;

public class LinkedHashMapLRU {

	public LinkedHashMapLRU() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		map.put("1", "One");
		map.put("2", "One");
		map.put("3", "One");
		System.out.println(map);
		map.remove("1");
		map.put("4", "One");
		System.out.println(map);
		map.put("1", "www");
		if(map.containsKey("3")){
			map.remove("3");
		}
		map.put("3", "One");
		System.out.println(map);
	}
}
