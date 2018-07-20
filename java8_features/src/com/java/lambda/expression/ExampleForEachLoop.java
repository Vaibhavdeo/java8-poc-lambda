package com.java.lambda.expression;

import java.util.ArrayList;
import java.util.List;

public class ExampleForEachLoop {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("adef");
		list.add("ghi");
		list.add("pqr");
		
		list.forEach((name)->System.out.println(name));
		
		
	}

}
