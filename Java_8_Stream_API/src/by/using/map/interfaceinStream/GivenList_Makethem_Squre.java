package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GivenList_Makethem_Squre {

	public static void main(String[] args) {
		
		List<Integer> lis=Arrays.asList(2,3,5,5,7,8,9);
		
		List<Integer> coll01 = lis.stream().map(p-> p *p).collect(Collectors.toList());

		//System.out.println(coll01);
		//or
		for(Integer i1 : coll01) {
			System.out.println(i1);
		}
	}

}
