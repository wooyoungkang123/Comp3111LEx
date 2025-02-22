package Lab1;

/*
 * Comp3111LEx\Lab1\myLibrary.java
 * My Java library consists of 2 mathematical functions
 */

public class myLibrary {

    public static int Power(int base, int exponent) {
        // Typically for exponent == 1, we might just return 'base'
        // but returning base * exponent is the same if exponent == 1.
        if (exponent == 1) {
            return base * exponent;   // or simply 'return base;'
        } else {
            return base * Power(base, exponent - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}