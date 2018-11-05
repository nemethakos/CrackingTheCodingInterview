package Chapter_13_Java;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Chapter_13_Java.LambdaRandom;

class LambdaRandomTest {

	@Test
	void testGetRandomSubset() {
		System.out.println(LambdaRandom.getRandomSubset(getList(1,100)));
	}

	private List<Integer> getList(int start, int end) {
		
		List<Integer> result = new ArrayList<>();
		for (int i=start; i<=end; i++) {
			result.add(i);
		}
		return result ;
	}

}
