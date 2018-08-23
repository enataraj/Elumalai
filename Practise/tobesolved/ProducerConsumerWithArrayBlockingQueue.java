package tobesolved;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithArrayBlockingQueue {

	public static void main(String[] args) throws Exception {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(2);

		BlockingQueueProducer queueProducer = new BlockingQueueProducer(blockingQueue);
		BlockingQueueConsumer queueConsumer = new BlockingQueueConsumer(blockingQueue);

		new Thread(queueProducer).start();
		new Thread(queueConsumer).start();
	}

}

class BlockingQueueConsumer implements Runnable {
	protected BlockingQueue<String> blockingQueue;

	public BlockingQueueConsumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			System.out.println("Size of the Queue : "+blockingQueue.size());
			Thread.sleep(1000);
			System.out.println(blockingQueue.take());
			Thread.sleep(2000);
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BlockingQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public BlockingQueueProducer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
//			Thread.sleep(500);
			blockingQueue.put("Lion");
			System.out.println("Size 1 "+blockingQueue.size());
//			Thread.sleep(1000);
			blockingQueue.put("Crocodile");
			System.out.println("Size 2 "+blockingQueue.size());
//			Thread.sleep(2000);
			blockingQueue.put("Jaguar");
			System.out.println("Size 3 "+blockingQueue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}