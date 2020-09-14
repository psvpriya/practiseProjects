package main.java.project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface FindIntersection {

	static public String findIntersectionMethodOne(String input ) {
		String[] splittedString = input.split(("(\", \")|[\"]"));

		//for(String str : splittedString)
		//System.out.println(str);

		String a = splittedString[1];
		List<String> stringListOne = Arrays.asList(a.split(", "));
		String b = splittedString[2];
		List<String> stringListTwo = Arrays.asList(b.split(", "));

		List<String> output = new ArrayList<String>();
		for(String str : stringListOne) {
			if(stringListTwo.contains(str)) {
				output.add(str);
			}
		}
		return output.toString();
	}
	
}
