package com.shobhit.reactive;

import com.shobhit.reactive.sources.ReactiveSources;

public class Exercise4 {
	public static void main(String[] args) {

		//	Print the value of fruitMono when it emits

		ReactiveSources.getFruit()
			.subscribe(System.out::println);


		//	Get the value of Mono into a String variable

		String fruit = ReactiveSources.getFruit()
				.block();
		System.out.println("Fruit - " + fruit);
	}
}