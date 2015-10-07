package org.jcc.patterns.creational.abstractfactory;

public class ConcreateFactory1 implements AbstractFactory {

    @Override
    public ProductA getObjectA() {
        return new ProductA1();
    }

    @Override
    public ProductB getObjectB() {
        return new ProductB1();
    }
}