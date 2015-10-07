package org.jcc.patterns.creational.abstractfactory;

public class VegetableSalad extends Salad {

	public VegetableSalad() {
		this("Vegetable");
	}

	public VegetableSalad(String name) {
		super(name);
	}
}