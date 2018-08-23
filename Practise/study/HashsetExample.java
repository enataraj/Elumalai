package study;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		// It will add and retrun boolean
		
		// if the value is not exist it will add and return true. 
		if(names.add("Elumalai")){
			System.out.println("Added");
		}
		
		// If it exist it wont add and return false.
		if(names.add("Elumalai")){
			System.out.println("Added");
		}else{
			System.out.println("Not Added");
		}
		
	}
}
