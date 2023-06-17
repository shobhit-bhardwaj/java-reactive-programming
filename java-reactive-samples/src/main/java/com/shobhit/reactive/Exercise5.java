package com.shobhit.reactive;

import com.shobhit.reactive.sources.ReactiveSources;

public class Exercise5 {
	public static void main(String[] args) throws Exception {

		/*
		 * onData calls when any new data comes into picture.
		 * onComplete and onError are two termination events.
		 */

		//	Print the value of integersFlux and print the terminal events
		//	like Error and Completion event.

		ReactiveSources.integersFlux()
			.subscribe(element -> System.out.println("Element - " + element),
					error -> System.err.println("Error - " + error),
					() -> System.out.println("Data Consumed, Process Completed."));

		System.out.println("Press Any Key to Continue");
		System.in.read();
	}
}