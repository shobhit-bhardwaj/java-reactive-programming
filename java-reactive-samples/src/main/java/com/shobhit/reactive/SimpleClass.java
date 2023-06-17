package com.shobhit.reactive;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class SimpleClass {
	public static String getUser() {
		try {
			System.out.println("getUser Start - " + LocalDateTime.now());
			TimeUnit.SECONDS.sleep(3);
			System.out.println("getUser End - " + LocalDateTime.now());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "USER";
	}

	public static String getUserProfile() {
		try {
			System.out.println("getUserProfile Start - " + LocalDateTime.now());
			TimeUnit.SECONDS.sleep(5);
			System.out.println("getUserProfile End - " + LocalDateTime.now());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "USER_PROFILE";
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Start Main");

		CompletableFuture<String> user = CompletableFuture.supplyAsync(SimpleClass :: getUser);
		CompletableFuture<String> userProfile = CompletableFuture.supplyAsync(SimpleClass :: getUserProfile);

		CompletableFuture.allOf(user, userProfile).join();

		System.out.println(user.get());
		System.out.println(userProfile.get());

		System.out.println("End Main");
	}
}
