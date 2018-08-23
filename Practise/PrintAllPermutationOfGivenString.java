import java.util.HashSet;
import java.util.Set;

public class PrintAllPermutationOfGivenString {

	public PrintAllPermutationOfGivenString() {
		// TODO Auto-generated constructor stub
	}
	
	private  static void generatePermutation(String str){
		Set<String> perms = new HashSet<>();
		
		for(int i=0;i<str.length();i++){
			StringBuffer sb = new StringBuffer(str);
			char ch = sb.charAt(i);
			sb.deleteCharAt(i);
			for(int j=0;j<=sb.length();j++){
				StringBuffer sb1 = new StringBuffer(sb);
				sb1.insert(j,ch);
				perms.add(sb1.toString());
//				System.out.println(sb1.toString());
			}
//			System.out.println(sb.toString());
		}
		
		System.out.println(perms);
	}

	public static void main(String[] args) {
		String str = "acbc";
		generatePermutation(str);
	}
}
