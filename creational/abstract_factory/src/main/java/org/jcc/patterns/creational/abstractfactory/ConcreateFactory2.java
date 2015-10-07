package org.jcc.patterns.creational.abstractfactory;

public class ConcreateFactory2 implements AbstractFactory {

    @Override
    public ProductA getObjectA() {
        return new ProductA2();
    }

    @Override
    public ProductB getObjectB() {
        return new ProductB2();
    }
}