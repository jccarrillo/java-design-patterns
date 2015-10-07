package org.jcc.patterns.creational.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        Application application = new Application();
        application.print(new ConcreateFactory1());
        application.print(new ConcreateFactory2());
    }
}