package org.jcc.patterns.creational.abstractfactory;

class Application {

    public void print(AbstractFactory abstractFactory) {
        ProductA objectA = abstractFactory.getObjectA();
        ProductB objectB = abstractFactory.getObjectB();

        System.out.println("AbstractFactory=" + abstractFactory.getClass().getSimpleName());
        System.out.println("ObjectA=" + objectA.getClass().getSimpleName());
        System.out.println("ObjectB=" + objectB.getClass().getSimpleName());
    }
}