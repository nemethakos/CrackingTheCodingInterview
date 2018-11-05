package data.util;

public class Country {
	public Country(String continent, int population) {
		super();
		this.continent = continent;
		this.population = population;
	}

	private String continent;
	private int population;

	public String getContinent() {
		return continent;
	}

	public int getPopulation() {
		return population;
	}
}