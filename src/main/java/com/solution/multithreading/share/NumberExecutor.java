package com.solution.multithreading.share;

public class NumberExecutor implements Runnable {

	private int number;
	private NumberGenerator numberGenerator;
	
	public NumberExecutor(int number, NumberGenerator numberGenerator) {
		this.number = number;
		this.numberGenerator = numberGenerator;
	}

	@Override
	public void run() {
		numberGenerator.print(number);
	}

}
