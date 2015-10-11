package org.jcc.patterns.creational.prototype;

public interface Prototype extends Cloneable {

    Prototype clone() throws CloneNotSupportedException;
}