package com.mantoring.arithmetic.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
    @Test
    public void testSubstractingTwoPositiveNumbers() {
        // Given
        Subtraction subtraction = new Subtraction(6, 2);

        // When
        double result = subtraction.execute();

        // Then
        assertEquals(4.0, result, 0.0);
    }
}