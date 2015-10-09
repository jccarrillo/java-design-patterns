package org.jcc.patterns.creational.factorymethod;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {
        Application application = new Application();
        application.print(new ConcreteFactory());
        application.print(new MoreConcreteFactory());
    }
}