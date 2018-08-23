import java.util.HashSet;

public class PalindromePermutation {
	public static void main(String[] args) {

		String str = "acabaac";
		HashSet<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				set.remove(ch);

			} else {
				set.add(ch);
			}
		}
		
		if(set.size() <=1){
			System.out.println("Given String is Palindrom with Permutation");
		}else{
			System.out.println("Given String is not Palindrome");
		}

	}

}
