package org.jcc.patterns.creational.abstractfactory;

public class FruitSalad extends Salad {

	public FruitSalad() {
		this("Fruit");
	}

	public FruitSalad(String name) {
		super(name);
	}
}