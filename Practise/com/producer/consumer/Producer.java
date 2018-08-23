package com.producer.consumer;

import java.util.List;

public class Producer implements Runnable {
	private List<String> products;

	public Producer(List<String> list) {
		this.products = list;
	}

	public void run() {
		int count = 0;
		while (true) {
			try {
				if (products.size() < 10) {
					products.add("Products added" + count);
					count++;
				} else {
					Thread.sleep(10000L);
				}

			} catch (Exception e) {

			}

			System.out.println(products);
		}
	}

}
