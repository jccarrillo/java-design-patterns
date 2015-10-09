package org.jcc.patterns.creational.factorymethod;

public class MoreConcreteFactory extends ConcreteFactory {

    @Override
    public Product getProduct() {
        return new MoreConcreteProduct();
    }
}