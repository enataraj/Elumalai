import java.util.Random;

public class GenerateRandom {

	public GenerateRandom() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;
		while(true){
		System.out.println(r.nextInt(2));
		count++;
		if(count==5){
			break;
		}
		}
		
	}

}
