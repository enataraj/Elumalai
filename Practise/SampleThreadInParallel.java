import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleThreadInParallel {

	public SampleThreadInParallel() {
		// TODO Auto-generated constructor stub
	}

	private static void runApplication() {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new Runnable() {
			@Override
			public void run() {
				continuePrint();

			}

		});
		executor.shutdown();

		System.out.println("-----------------");

	}

	private static void continuePrint() {
		try {
			int count = 0;
			while (true) {
//				Thread.sleep(2000);
				System.out.println("in progress");

				if (count == 5) {
					System.exit(1);
				} else {
					count++;
				}
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		runApplication();
	}
}
