/*
 * For the Given Number How many bits are in 1
 * 
 */
public class CountBitsForNumber {
	
	public static void countBits(int number){
		int numBits = 0;
		while(number != 0){
			numBits = numBits+(number&1);
			number = number >>>1;
		}
		
		System.out.println("Number of Bits : "+numBits);
	}
	
	public static void main(String[] args) {
		countBits(100);
	}

}
