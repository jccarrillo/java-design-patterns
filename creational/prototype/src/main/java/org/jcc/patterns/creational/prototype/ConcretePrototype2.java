package org.jcc.patterns.creational.prototype;

public class ConcretePrototype2 implements Prototype {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}