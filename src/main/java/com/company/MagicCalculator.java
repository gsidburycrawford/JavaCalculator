package com.company;
import java.util.*;

public class MagicCalculator extends Calculator {

    public static double squareRoot(int num1) {
        return Math.sqrt(1);
    }

    public static double sin(int num1) {
        return Math.sin(num1);
    }

    public static double cosine(int num1) {
        return Math.cos(num1);
    }

    public static double tangent(int num1) {
        return Math.tan(num1);

    }

    public static int factorial(int num1) {
        int product = 1;
        for (int i = 1; i <= num1; i++) {
            product = multiplication(i, product);
        }
        return product;
    }




}
