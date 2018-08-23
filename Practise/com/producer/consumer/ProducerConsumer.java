package com.producer.consumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		Thread prod = new Thread(new Producer(products));
		Thread con = new Thread(new Consumer(products));
		prod.start();
		con.start();
	}

}
