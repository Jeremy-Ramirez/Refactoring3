/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsessionBad;


public class City {

	private final String name;
	private final int population;
	

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return  population;
	}

	public City(String name, int population) {
		this.name = name;
		this.population = population;
		

	}

	public String toString() {
		return String.format( "%s has a popluation of %s ",
				name, population);
	}
	
	public static final City[] ALL_CITIES={

		new City("London",13000000),

		new City("New York",21903623),

		new City("Tokyo",12570000),

		new City("Stockholm",1932763),

		new City("Barcelona",1605602),

		new City("Sydney",4119190)

		};
	
}


