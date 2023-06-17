package com.shobhit.reactive;

import java.time.Duration;
import java.util.Arrays;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSources {

	private ReactiveSources() {
	}

	public static Mono<String> getFruit() {
		return Mono
				.just("Kiwi")
				.delayElement(Duration.ofSeconds(1));
	}

	public static Flux<String> getFruits() {
		//return Flux.just("Apple", "Banana", "Grapes", "Mango", "Orange");
		//return Flux.fromStream(Stream.of("Apple", "Banana", "Grapes", "Mango", "Orange"));

		return Flux
				.fromIterable(Arrays.asList("Apple", "Banana", "Grapes", "Mango", "Orange"))
				.delayElements(Duration.ofSeconds(1));
	}

	public static Flux<User> getUsers() {
		return Flux
				.just(new User(101, "Shobhit"), new User(102, "Ravi"), new User(103, "Rajesh"))
				.delayElements(Duration.ofSeconds(1));
	}
}
