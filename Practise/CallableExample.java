import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("Elumalai");
		Thread.sleep(1000);
		System.out.println("Sleep Done");
		return 10;
	}

	public static void main(String[] args) throws Exception {
		CallableExample example = new CallableExample();
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		FutureTask<Integer> task = new FutureTask<>(example);
		task.run();
		System.out.println("----------"+task.get());
		
		service.submit(example);
		service.shutdown();

	}
}
