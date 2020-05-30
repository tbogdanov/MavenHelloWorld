package org.tbogdanov.helloWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tbogdanov.helloWorld.HelloWorld.add2;

/**
 * Created by Timur Bogdanov on 30.05.20.
 */
public class HelloWorldTest {

    @Test
    public void add2Test() {
        assertEquals(5, add2(2, 3));
    }

}
