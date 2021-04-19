package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers is: " +  MagicCalculator.add(num1,num2));
        System.out.println("The difference of the two numbers is: " +  MagicCalculator.subtract(num1,num2));
        System.out.println("The product of the two numbers is: " +  MagicCalculator.multiplication(num1,num2));
        System.out.println("The dividend of the two numbers is: " +  MagicCalculator.division(num1,num2));
        System.out.println("The square of the first number is: " +  MagicCalculator.square(num1));
        System.out.println("The square root of the first number is: " +  MagicCalculator.squareRoot(num1));
        System.out.println("The sin of the first number is: " +  MagicCalculator.sin(num1));
        System.out.println("The cosin of the first number is: " +  MagicCalculator.cosine(num1));
        System.out.println("The tangent of the first number is: " +  MagicCalculator.tangent(num1));
        System.out.println("The factorial of the first number is: " +  MagicCalculator.factorial(num1));
    }

}
