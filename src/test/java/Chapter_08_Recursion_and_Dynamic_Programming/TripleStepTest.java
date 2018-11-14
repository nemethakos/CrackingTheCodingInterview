package Chapter_08_Recursion_and_Dynamic_Programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleStepTest {

	@Test
	void testGetCountPossibleWaysTheChildCanRunUpTheStairs() {
		for (var i = 0; i <= 30; i++) {
			long start = System.nanoTime();
			var count = TripleStep.getCountPossibleWaysTheChildCanRunUpTheStairs(i);
			long endCount = System.nanoTime();
			var countIterative = TripleStep.getCountPossibleWaysTheChildCanRunUpTheStairsIterative(i);
			long endCountIterative = System.nanoTime();
			long nanoRecursive = endCount-start;
			long nanoIterative = endCountIterative-endCount;
			System.out.println("" + i + "->" + count + "(" +nanoRecursive+"ns), "+ countIterative + "("+nanoIterative+"ns)");
		}
	}

}
