package Chapter_13_Java;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * <b>Lambda Random:</b> Using Lambda expressions, write a function
 * <p>
 * <code>List<Integer> getRandomSubset ( List< Integer> list)</code>
 * <p>
 * that returns a random subset of arbitrary size. All subsets (including the
 * empty set) should be equally likely to be chosen.
 */
public class LambdaRandom {

	public static List<Integer> getRandomSubset(List<Integer> list) {

		final Random rnd = new Random();

		return list.stream().filter(value -> rnd.nextBoolean()).collect(Collectors.toList());
	}

}
