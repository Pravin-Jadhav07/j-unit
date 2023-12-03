package org.exampleTest;

import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatotTest {
    Calculator cal = null;
    @BeforeEach
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(5,cal.add(2,3));
    }

}
