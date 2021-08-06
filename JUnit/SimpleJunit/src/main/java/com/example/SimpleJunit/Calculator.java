package com.example.SimpleJunit;

import java.util.ArrayList;
import java.util.List;

class CompletedCalculation {

    private int augend;
    private int addend;
    private int sum;

    public CompletedCalculation(int augend, int addend, int sum) {
        this.augend = augend;
        this.addend = addend;
        this.sum = sum;
    }

    // ... getters & setters ...
}

class CalculationHistory {

    private final List<CompletedCalculation> calculations = new ArrayList<CompletedCalculation>();

    public void append(CompletedCalculation calculation) {
        calculations.add(calculation);
    }

    // ... getter ...
}

public class Calculator {

    private CalculationHistory history;

    public Calculator(CalculationHistory history) {
        this.history = history;
    }

    public int add(int a, int b) {
        int sum = a + b;
        history.append(new CompletedCalculation(a, b, sum));
        return sum;
    }
}