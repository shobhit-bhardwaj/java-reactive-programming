package com.shobhit.reactive;

import java.time.Duration;

import com.shobhit.reactive.sources.ReactiveSources;

public class Exercise7 {
	public static void main(String[] args) throws Exception {

		//	Get a value from unresponsive Mono/Flux but give up after 5 seconds

		ReactiveSources.unresponsiveMono()
			.block(Duration.ofSeconds(5));

		ReactiveSources.unresponsiveFlux()
			.blockFirst(Duration.ofSeconds(5));

		System.out.println("Press Any Key to Continue");
		System.in.read();
	}
}