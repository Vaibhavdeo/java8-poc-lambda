package com.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithoutStreamExample2Fileter {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram", "Peter", "PAM");
		List<String> filterdList = getFilteredList(list);
		List<String> filterdList2 = getFilteredListStreaam(list);
		System.out.println(filterdList2);

	}

	private static List<String> getFilteredList(List<String> list) {
		List<String> filteredList = new ArrayList<>();
		for (String name : list) {

			if (name.startsWith("P")) {
				System.out.println("name starts with p " + name);
				filteredList.add(name);
			}
		}
		return filteredList;

	}
	
	private static List<String> getFilteredListStreaam(List<String> list) {
		List<String> filteredList = new ArrayList<>();
		Stream<String> streamList = list.stream();
		streamList = streamList.filter(name->name.startsWith("P"));
		filteredList = streamList.collect(Collectors.toList());
		return filteredList;

	}

}
