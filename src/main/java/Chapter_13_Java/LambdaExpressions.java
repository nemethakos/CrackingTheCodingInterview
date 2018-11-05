package Chapter_13_Java;

import java.util.List;
import java.util.stream.Collectors;

import data.util.Country;

/**
 * <b>Lambda Expressions:</b> There is a class Country that has methods
 * <ul>
 * <li>getContinent() and
 * <li>getPopulation().
 * </ul>
 * <p>
 * Write a function
 * <code>int getPopulation(List<Country> countries, String continent)</code>
 * that computes the total population of a given continent, given a list of all
 * countries and the name of a continent.
 */
public class LambdaExpressions {

	public static int getPopulation(List<Country> countries, String continent) {

		return (int) countries//
				.stream()//
				.filter(country -> country.getContinent().equals(continent))//
				.collect(Collectors//
						.summarizingInt(country -> country.getPopulation()))//
				.getSum();
	}

}
