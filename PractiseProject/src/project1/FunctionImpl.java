package project1;

import java.util.ArrayList;
import java.util.List;

public class FunctionImpl implements MyFunction {

	@Override
	public List<Integer> arrayOfMultiples(Integer baseNumber, Integer count) {
		List<Integer> multiplesList = new ArrayList<Integer>();
		
		for(int i=1; i<=count; i++) {
			multiplesList.add(baseNumber*i);
		}
		
		return multiplesList;
	}

}
