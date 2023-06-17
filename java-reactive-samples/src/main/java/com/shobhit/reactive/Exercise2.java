package com.shobhit.reactive;

import com.shobhit.reactive.sources.ReactiveSources;

public class Exercise2 {
	public static void main(String[] args) throws Exception {

		//	Print fruit from fruitMono

		ReactiveSources.getFruit()
			.subscribe(System.out::println);


		//	Print all fruits from fruitFlux

		ReactiveSources.getFruits()
			.subscribe(System.out::println);


		//	Print all users from userFlux

		ReactiveSources.getUsers()
			.subscribe(System.out::println);

		System.out.println("Press Any Key to Continue");
		System.in.read();
	}
}