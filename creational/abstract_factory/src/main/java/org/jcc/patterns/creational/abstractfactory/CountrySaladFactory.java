package org.jcc.patterns.creational.abstractfactory;

public abstract class CountrySaladFactory {

	private String countryName;

	public CountrySaladFactory(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public abstract VegetableSalad getVegetableSalad();

	public abstract FruitSalad getFruitSalad();
}