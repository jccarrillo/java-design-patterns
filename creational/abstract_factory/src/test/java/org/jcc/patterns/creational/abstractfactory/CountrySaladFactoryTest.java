package org.jcc.patterns.creational.abstractfactory;

import java.util.Calendar;

import org.junit.Test;

public class CountrySaladFactoryTest {

	public static Salad getSalad(CountrySaladFactory countrySaladFactory) {
		int dayOfWeek = Calendar.SATURDAY;

		if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
			return countrySaladFactory.getFruitSalad();
		} else {
			return countrySaladFactory.getVegetableSalad();
		}
	}

	public static void print(CountrySaladFactory countrySaladFactory) {
		String countryName = countrySaladFactory.getCountryName();
		Salad salad = getSalad(countrySaladFactory);
		String saladName = salad.getName();

		System.out.println("The Salad of the day in " + countryName + " is " + saladName + " salad.");
	}

	@Test
	public void test() {
		print(new AmericanSaladFactory());
		print(new MexicanSaladFactory());
	}
}