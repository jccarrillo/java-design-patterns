package org.jcc.patterns.creational.builder;

class Application {

    public void print() {
        Builder builder = new Builder();
        Product product = builder.build();

        System.out.println("Product=" + product.getClass().getSimpleName());
    }
}