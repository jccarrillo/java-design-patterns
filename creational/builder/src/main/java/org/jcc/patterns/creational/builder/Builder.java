package org.jcc.patterns.creational.builder;

public class Builder {

    public Product build() {
        return new ConcreteProduct();
    }
}