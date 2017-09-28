package com.mantoring.arithmetic.operations;

import com.mantoring.arithmetic.BinaryOperation;

public class Addition extends BinaryOperation{

    public Addition(double a, double b) {
        super(a, b);
    }

    public double execute() {
        return this.a + this.b;
    }
}
