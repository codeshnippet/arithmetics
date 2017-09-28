package com.mantoring.arithmetic.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void testAddingTwoPositiveNumbers() {
        // Given
        Addition addition = new Addition(3, 4);

        // When
        double result = addition.execute();

        // Then
        assertEquals(7.0, result, 0.0);
    }
}