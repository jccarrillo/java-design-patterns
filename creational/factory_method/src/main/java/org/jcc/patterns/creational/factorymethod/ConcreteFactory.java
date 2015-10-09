package org.jcc.patterns.creational.factorymethod;

public class ConcreteFactory implements Factory {

    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
}