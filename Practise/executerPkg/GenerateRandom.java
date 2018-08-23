package executerPkg;

import java.util.Random;
import java.util.concurrent.Callable;

public class GenerateRandom implements Callable<Integer> {
	public Integer call() {
		int num = 0;
		try {
			Random ra = new Random();
			num = ra.nextInt(100);
			System.out.println("Num : " + num);
			Thread.sleep(num*1000);
		} catch (Exception e) {

		}
		return num;
	}

}
