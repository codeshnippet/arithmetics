package com.mantoring.arithmetic.services;

import com.mantoring.arithmetic.operations.Addition;
import com.mantoring.arithmetic.operations.Subtraction;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArithmeticServiceTest {

    private ArithmeticService service = new ArithmeticService();

    @Test
    public void calculateSingleAdditionOperation() {
        // When
        double result = service.calculate(new Addition(1, 2));

        // Then
        assertEquals(3.0, result, 0.0);

    }

    @Test
    public void calculateSingleSubstractionOperation() {
        // When
        double result = service.calculate(new Subtraction(3, 2));

        // Then
        assertEquals(1.0, result, 0.0);
    }

    @Test
    public void calculateSubtractionAndAdditionOperations() {
        // When
        List<Double> result = service.calculate(new Subtraction(2, 1), new Addition(2, 3));

        // Then
        assertEquals(Arrays.asList(1.0, 5.0), result);
    }

    @Test
    public void calculateZeroOperations() {
        // When
        List<Double> result = service.calculate();

        // Then
        assertEquals(Collections.<Double>emptyList(), result);
    }

}