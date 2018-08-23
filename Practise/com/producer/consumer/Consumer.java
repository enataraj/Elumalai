package com.producer.consumer;

import java.util.List;

public class Consumer implements Runnable {
	private List<String> products;

	public Consumer(List<String> products) {
		this.products = products;
	}

	public void run() {
		while (true) {
			try {
				if (products.size() != 0) {
					String str = products.remove(0);
					System.out.println("Consumed : " + str);
				} else {
					Thread.sleep(10000L);
				}
			} catch (Exception e) {

			}
		}
	}
}
