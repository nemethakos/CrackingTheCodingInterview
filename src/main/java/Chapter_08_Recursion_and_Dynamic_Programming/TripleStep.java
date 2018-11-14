package Chapter_08_Recursion_and_Dynamic_Programming;

public class TripleStep {

	/**
	 * <p>
	 * <b>Triple Step:</b> A child is running up a staircase with n steps and can
	 * hop either
	 * <ul>
	 * <li>1 step,
	 * <li>2 steps, or
	 * <li>3 steps at a time.
	 * </ul>
	 * <p>
	 * Implement a method to count how many possible ways the child can run up the
	 * stairs.
	 * 
	 * @param stairCaseStepsCount
	 * @return
	 */
	public static int getCountPossibleWaysTheChildCanRunUpTheStairs(int stairCaseStepsCount) {
		// base cases
		if (stairCaseStepsCount < 0) {
			return 0;
		}

		if (stairCaseStepsCount == 0) {
			// 1
			return 1;
		}

		return getCountPossibleWaysTheChildCanRunUpTheStairs(stairCaseStepsCount - 1)
				+ getCountPossibleWaysTheChildCanRunUpTheStairs(stairCaseStepsCount - 2)
				+ getCountPossibleWaysTheChildCanRunUpTheStairs(stairCaseStepsCount - 3);
	}

	public static int getCountPossibleWaysTheChildCanRunUpTheStairsIterative(int stairCaseStepsCount) {
		
		int cacheSize = 4;
		if (stairCaseStepsCount+1 > cacheSize) {
			cacheSize = stairCaseStepsCount+1;
		}
		int[] stepsCount = new int[cacheSize];
		stepsCount[0] = 1;
		stepsCount[1] = 1;
		stepsCount[2] = 2;
		stepsCount[3] = 4;

		for (int steps = 4; steps <= stairCaseStepsCount; steps++) {
			stepsCount[steps] = stepsCount[steps - 1] + stepsCount[steps - 2] + stepsCount[steps - 3];
		}

		return stepsCount[stairCaseStepsCount];

	}

}
