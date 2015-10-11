package org.jcc.patterns.creational.prototype;

import org.junit.Test;

public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Application application = new Application();
        application.print(new ConcretePrototype1());
        application.print(new ConcretePrototype2());
    }
}