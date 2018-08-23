package tobesolved;

/*
 * 
 * //When src = "100", return 100;
//When src = "-3", return -3;

// -Integer.Min-- 0 -- +Integer.Max 
public int parseInt(String src) throws Exception {

HashMap<charter,character> map = new HashMap<>();

map.put('0','');
map.put('1','');
map.put('2','');
..

map.put('9','');

String str = "0123456789";

if(src == null || src.length ==0)
     throw new Exception("Invalid argument");
    
  
     
      
   long int sum =0;
   int j =0;
   boolean nagativeflag;
   if(src.charAt(0) == '-'){
     nagativeflag = true;
     }
   int minValue = 0;
   if(nagativeflag ){
   minValue  =1
   }  
   
   
   
   for(int i =src.length -1;i>= minValue  ;i--){
if(!   str.contains(charAt(i)){
}

if   (map.get(src.CharAt(i))! == null){
throw new Exception("Invalid Input ");
}
   int number = src.charAt(i) - 48;   
   
   if(number <0 || number >9){
   throw new Exception()
   }
    number = number* Math.Pow(10,j);
    j++;
    sum = sum+number;
 // cross the rang Integer.max   if(
   }
   
   if(!(sum > Integer,Min && sum < Integer.max_va)){
   throw new Exception("Out of Integer Range");
   }
   if(nagativeflag ){
   return sum*(-1);
   }
   return sum;
  
}
    
}
 * 
 * 
 */
public class StringToNumberConversion {

	public static int parseInt(String number) throws NumberFormatException {

		int sum = 0;
		int j = 0;

		for (int i = number.length() - 1; i >= 0; i--) {
			int num = number.charAt(i) - 48;
			sum = sum + (num * (int) Math.pow(10, j));
			j++;
		}
		System.out.println("Sum : " + sum);
		return sum;

	}

	public static void main(String[] args) {
		StringToNumberConversion.parseInt("345");

	}

}
