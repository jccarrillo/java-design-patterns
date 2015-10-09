package org.jcc.patterns.creational.factorymethod;

class Application {

    public void print(Factory factory) {
        Product product = factory.getProduct();

        System.out.println("Factory=" + factory.getClass().getSimpleName());
        System.out.println("Product=" + product.getClass().getSimpleName());
    }
}