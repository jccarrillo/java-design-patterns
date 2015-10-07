package org.jcc.patterns.creational.abstractfactory;

public class MexicanSaladFactory extends CountrySaladFactory {

	public MexicanSaladFactory() {
		super("Mexico");
	}

	@Override
	public FruitSalad getFruitSalad() {
		return new FruitSalad();
	}

	@Override
	public VegetableSalad getVegetableSalad() {
		return new CaesarSalad();
	}
}