package com.shobhit.reactive;

public class Exercise1 {
	public static void main(String[] args) {

		//	Print all numbers in intNumbersStream

		StreamSources.intNumbersStream()
			.forEach(System.out :: println);


		//	Print numbers from intNumbersStream which are less then 5
		StreamSources.intNumbersStream()
			.filter(i -> i<5)
			.forEach(System.out :: println);


		//	Print second and third number from intNumbersStream that's greater then 5

		StreamSources.intNumbersStream()
			.filter(i -> i<5)
			.skip(1)
			.limit(2)
			.forEach(System.out :: println);


		//	Print first number from intNumbersStream that's greater then 5, if not then print -1

		Integer val = StreamSources.intNumbersStream()
			.filter(i -> i<5)
			.findFirst()
			.orElse(-1);
		System.out.println("Number - " + val);


		//	Print first name from usersStream

		StreamSources.usersStream()
			.map(User :: getName)
			.forEach(System.out :: println);


		//	Print first name from usersStream of all users which Ids are in intNumbersStream

		StreamSources.intNumbersStream()
			.flatMap(id -> StreamSources.usersStream().filter(user -> user.getId() == id))
			.map(User :: getName)
			.forEach(System.out :: println);

		StreamSources.usersStream()
			.filter(user -> StreamSources.intNumbersStream().anyMatch(i -> i == user.getId()))
			.map(User :: getName)
			.forEach(System.out :: println);
	}
}