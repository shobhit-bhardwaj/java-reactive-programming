package com.shobhit.reactive;

import org.reactivestreams.Subscription;

import com.shobhit.reactive.sources.ReactiveSources;

import reactor.core.publisher.BaseSubscriber;

public class Exercise6 {
	public static void main(String[] args) throws Exception {

		//	Print the value of integersFlux by using a Subscription Class for Back Pressure

		ReactiveSources.integersFlux()
			.subscribe(new MySubscription());

		System.out.println("Press Any Key to Continue");
		System.in.read();
	}

	private static class MySubscription extends BaseSubscriber<Integer> {
		@Override
		protected void hookOnSubscribe(Subscription subscription) {
			System.out.println("Subscription Attached");
			request(1);
		}

		@Override
		protected void hookOnNext(Integer value) {
			System.out.println("Element - " + value);
			request(1);
		}

		@Override
		protected void hookOnComplete() {
			System.out.println("Data Consumed, Process Completed.");
		}

		@Override
		protected void hookOnError(Throwable error) {
			System.err.println("Error - " + error);
		}
	}
}