package tobesolved;

public class TwoThreadPrintNumbersInSequence {
	public static void main(String[] args) {

		Counter counter = new Counter();
		ThreadExample t1 = new ThreadExample(counter);
		ThreadExample t2 = new ThreadExample(counter);
		t1.start();
		t2.start();
	}

}

class Counter {
	public volatile int number = 0;
}

class ThreadExample extends Thread {
	Counter counter;

	ThreadExample(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		try {
			while (counter.number < 100) {
				counter.number = counter.number + 1;
				System.out.print(" " + counter.number);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Excepiton " + e);
		}
	}
}