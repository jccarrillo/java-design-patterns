package org.jcc.patterns.creational.prototype;

class Application {

    public void print(Prototype prototype) throws CloneNotSupportedException {
        Prototype clone = prototype.clone();

        System.out.println("Prototype=" + prototype.getClass().getSimpleName());
        System.out.println("Clone=" + clone.getClass().getSimpleName());
    }
}