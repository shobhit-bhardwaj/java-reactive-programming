package com.shobhit.reactive;

import java.util.List;

public class Exercise3 {
	public static void main(String[] args) throws Exception {

		//	Get all Users from a ReactiveSource userFlux and dump into a list
		//	and print it.

		ReactiveSources.getUsers()
			.toStream()
			.forEach(System.out::println);

		List<User> users = ReactiveSources.getUsers()
			.toStream()
			.toList();

		System.out.println("List - " + users);

		System.out.println("Method Execution End");
	}
}