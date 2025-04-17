package com.ms.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperTOLowerCase {
	
	public static void main(String[] args) {
		
		
		List<String> l1 = new ArrayList<>();
		l1.add("mrinal");
		l1.add("qwerty");
		l1.add("ASDFG");
		
		List<String> l2 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	
		System.out.println(l2);
		List<String> l3 = l2.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l3);
	}

}
