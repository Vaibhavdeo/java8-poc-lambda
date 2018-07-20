package com.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample1 {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(1, 3, 4, 5, 6, 7, 8);

		stream1.forEach(System.out::println);

		Stream<Character> stream2 = Stream.of('A', 'B', 'C');

		stream2.forEach(System.out::println);
		
		//Using Array of Element
		
		Integer arrayElement[] = {1,23,4,6,7,78,};
		Stream<Integer> streamArray = Stream.of(arrayElement);
		streamArray.forEach(System.out::println);
		
		
		//Collection
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		
		//Parallel Stream
		
	}

}
