package com.producer.consumer.Wait;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	List<String> products = new ArrayList<>();
	int count = 0;

	public void Produce() {
		try {
			System.out.println("Producer Called");
			while (true) {
				if (products.size() >= 10) {
					wait();
				} else {
					products.add("Product :" + count);
					System.out.println("Products Produced " + products);
					count++;
				}
				notify();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Exception during produce " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void consume() {
		try {
			System.out.println("Consumer Called");
			while (true) {
				if (products.size() == 0) {
					wait();
				} else {

					products.remove(0);
					System.out.println("Products Consumed " + products);
				}
				notify();
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println("Exception during Consume " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Producer Thread");
				new ProducerConsumer().Produce();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Consumer Thread");
				new ProducerConsumer().consume();
			}
		};

		t1.start();
		t2.start();
	}
}
