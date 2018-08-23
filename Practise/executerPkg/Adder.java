package executerPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Adder {

	public void AddNumber() throws Exception {

		ExecutorService service = Executors.newFixedThreadPool(5);
		List<Future<Integer>> futures = new ArrayList<>();
		;
		for (int i = 0; i < 5; i++) {
			System.out.println("Beofore Job Sumbimision");
			Future<Integer> future = service.submit(new GenerateRandom());
			System.out.println("after Job Sumbimision");
			futures.add(future);
		}
		service.shutdown();

		int sum = 0;
		for (int i = 0; i < futures.size(); i++) {
			System.out.println("Before Sum "+sum);
			sum = sum + futures.get(i).get();
			System.out.println("After Sum"+sum);
		}
		System.out.println("Sum : " + sum);
	}

	public static void main(String[] args) {
		System.out.println("Executer Service ");
		try {
			new Adder().AddNumber();
		} catch (Exception e) {

		}
	}
}
