
public class IntegerToString {
	public static void main(String[] args) {
		int a = -800;
		
		boolean negative = false;
		if(a<0){
			negative = true;
			a = a*(-1);
		}

		StringBuilder str = new StringBuilder();
		do {  // Do while to avoid for zero value
			int mod = a % 10;
			a = a / 10;
			str.append((char)('0'+mod));   // Converting int to char 
		}while (a != 0);

		if(negative){
			str.append('-');
		}
		System.out.println("Before Reverse :"+str);
		System.out.println("Result : " + str.reverse());
	}

}
