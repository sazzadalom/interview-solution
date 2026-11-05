package com.solution.multithreading.share;

public class NumberGenerator {

	private int number = 1;
	
	private int threadCount;
	
	private int printUpto;
	
	public NumberGenerator(int threadCount, int printUpto) {
		this.threadCount = threadCount;
		this.printUpto = printUpto;
	}
	
	public void print(int thread) {
		synchronized(this) {
			while(number<printUpto-1) {
				while(number % threadCount != thread) {
					try {
						wait();
					} catch(InterruptedException exception) {
						Thread.currentThread().interrupt();
					}
					
					System.out.println(Thread.currentThread().getName() + " : " + number++);
					notifyAll();
				}
			}
		}
	}
	
}
