package com.solution.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	
	AtomicInteger counter = new AtomicInteger();
	
	public void increment() {
		counter.getAndIncrement();
	}
	
	public void print() {
		System.out.println(counter);
	}
}

public class CounterRunner implements Runnable {
	static Counter counter = new Counter();
	
	public static void main(String[] args) {
		Thread t = new Thread(new CounterRunner());
		
		Thread tt = new Thread(new CounterRunner());
		
		t.start();
		
		tt.start();
		
		counter.print();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter.increment();
		}
	}

}
