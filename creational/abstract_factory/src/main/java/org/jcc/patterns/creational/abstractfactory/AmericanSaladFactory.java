package org.jcc.patterns.creational.abstractfactory;

public class AmericanSaladFactory extends CountrySaladFactory {

	public AmericanSaladFactory() {
		super("America");
	}

	@Override
	public FruitSalad getFruitSalad() {
		return new GlorifiedRiceSalad();
	}

	@Override
	public VegetableSalad getVegetableSalad() {
		return new VegetableSalad();
	}
}