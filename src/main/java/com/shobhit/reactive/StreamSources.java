package com.shobhit.reactive;

import java.util.stream.Stream;

public class StreamSources {

	private StreamSources() {
	}

	public static Stream<String> stringNumbersStream() {
		return Stream.of("One", "Two", "Three", "Four", "Five",
				"Six", "Seven", "Eight", "Nine", "Ten");
	}

	public static Stream<Integer> intNumbersStream() {
		return Stream.iterate(0, i -> i+1).limit(10);
	}

	public static Stream<User> usersStream() {
		return Stream.of(
				new User(1, "Shobhit"),
				new User(5, "Ravi"),
				new User(15, "Rajesh")
			);
	}
}