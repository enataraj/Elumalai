
public class CharToIntegerConversion {

	public CharToIntegerConversion() {
		// TODO Auto-generated constructor stub
	}
	
	private static void convertInteger(String str){
		char[]  a =  str.toCharArray();
		int[] res = new int[a.length];
		for(int i=0;i<a.length;i++){
			res[i] = a[i];
			System.out.println(res[i]);
		}
	}

	public static void main(String[] args) {
		String str = "abcd";
		convertInteger(str);
	}
}
