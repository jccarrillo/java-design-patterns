package org.jcc.patterns.creational.abstractfactory;

public abstract class Salad {

	private String name;

	public Salad(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}