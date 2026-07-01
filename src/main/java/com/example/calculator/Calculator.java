package com.example.calculator;

public class Calculator {
    public int add(int a, int b) {
        rpackage com.example.calculator;

public class Calculator {
    
    // Corrected: Added the '+' operator
    public int add(int a, int b) {
        return a + b;
    }

    // Corrected: Added the '-' operator
    public int subtract(int a, int b) {
        return a - b;
    }

    // Corrected: Changed '+' to '*' for actual multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // This logic was already perfect!
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Optional main method so you can test it locally if needed
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}eturn a  b;
    }

    public int subtract(int a, int b) {
        return a  b;
    }

    public int multiply(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
