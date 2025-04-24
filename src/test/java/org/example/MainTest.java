package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(5, Main.add(2, 3));
        assertEquals(0, Main.add(-1, 1));
    }
}