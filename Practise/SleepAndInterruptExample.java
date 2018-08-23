
public class SleepAndInterruptExample {

	public static void main(String[] args) throws Exception {
		System.out.println("I am starting ... ");
		TestThread tt = new TestThread();
		tt.start();
		tt.interrupt();
//		tt.join();
		System.out.println("Interept is done...");

	}
}
