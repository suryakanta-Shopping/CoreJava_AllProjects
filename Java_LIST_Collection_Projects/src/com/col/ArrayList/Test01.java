package com.col.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test01 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(3, 4, 5, 2, 1, 4, 7, 8, 9, 3);

		List<Integer> collect = al.stream().distinct().collect(Collectors.toList());
		

		System.out.println(collect);
	}

}
