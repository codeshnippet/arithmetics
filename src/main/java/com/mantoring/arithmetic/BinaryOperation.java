package com.mantoring.arithmetic;

public abstract class BinaryOperation {

    protected double a, b;

    public BinaryOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double execute();
}
