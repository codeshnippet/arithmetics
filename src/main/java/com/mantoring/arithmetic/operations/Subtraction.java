package com.mantoring.arithmetic.operations;

import com.mantoring.arithmetic.BinaryOperation;

public class Subtraction extends BinaryOperation {

    public Subtraction(double a, double b) {
        super(a, b);
    }

    public double execute() {
        return a - b;
    }
}
