package Chapter_13_Java;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Chapter_13_Java.LambdaExpressions;
import data.util.Country;

class LambdaExpressionsTest {

	@Test
	void testGetPopulation() {

		var c1 = new Country("Europe", 1_000_000);
		var c2 = new Country("Asia", 1_000_000);
		var c3 = new Country("North America", 1_000_000);
		var c4 = new Country("South America", 1_000_000);
		var c5 = new Country("Antarctica", 4_490);
		var c6 = new Country("Oceania", 1_000_000);
		var c7 = new Country("Africa", 1_000_000);

		var countries = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);

		var population = LambdaExpressions.getPopulation(countries, "Europe");
		
		System.out.println("Population: " + population);
	}

}
