package com.shobhit.reactive;

import com.shobhit.reactive.models.User;
import com.shobhit.reactive.sources.ReactiveSources;

import reactor.core.publisher.Flux;

public class Exercise8 {
	public static void main(String[] args) throws Exception {

		//	Use some basic operators like map, filter, take

		Flux<User> userFlux = ReactiveSources.getUsers();
		userFlux
			.filter(user -> user.getName().startsWith("R"))
			.map(User::getName)
			.take(1)
			.subscribe(System.out::println);

		System.out.println("Press Any Key to Continue");
		System.in.read();
	}
}