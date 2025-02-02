package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping_To_FlattenList_04 {

	public static void main(String[] args) {

		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 6));

		List<Integer> collect05 = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println(collect05);
	}

}
