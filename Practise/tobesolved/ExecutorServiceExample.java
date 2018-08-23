package tobesolved;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

	public void populateNumbers() {
		try {
			System.out.println("Started the Process...");
			List<Future<List<Integer>>> futures = new ArrayList<Future<List<Integer>>>();
			ExecutorService numberGenerationService = Executors.newFixedThreadPool(15);
			for (int i = 0; i < 10000; i++) {
				try {
					Callable<List<Integer>> numGeneraThread = new Callable<List<Integer>>() {
						public List<Integer> call() throws Exception {
							List<Integer> numList = new ArrayList<Integer>();
							numList.add(getNum());
							return numList;
						}
					};
					futures.add(numberGenerationService.submit(numGeneraThread));
				} catch (Exception e) {
					System.err.println("Exception During Number Generation ");
					e.printStackTrace();
				}
				System.out.println("Size of Furure :"+futures.size());
			}
			
			numberGenerationService.shutdown();

			ArrayList<Integer> result = new ArrayList<>();

			for (Future<List<Integer>> lnumfuture : futures) {
				result.addAll(lnumfuture.get());
			}
			System.out.println("Size of Result : "+result.size());
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("error : " + e);
		}
	}

	public int getNum() throws Exception {
		Thread.sleep(1000);
		Random ran = new Random();
		return ran.nextInt(5000);
	}

	public static void main(String[] args) {
		ExecutorServiceExample exam = new ExecutorServiceExample();
		exam.populateNumbers();
	}
}
