package com.shobhit.reactive.sources;

import java.time.Duration;
import java.util.Arrays;

import com.shobhit.reactive.models.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSources {

	private ReactiveSources() {
	}

	public static Flux<Integer> integersFlux() {
		return Flux
				.just(1, 2, 3, 4, 5)
				.delayElements(Duration.ofSeconds(1));
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
