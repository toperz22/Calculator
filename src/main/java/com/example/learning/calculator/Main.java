package com.example.learning.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator");


        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new CalculatorImpl();

        boolean exit = false;
        do {
        printInfo();
        byte operationNumber = scanner.nextByte();
        switch (operationNumber) {
            case 1:
                additionOperation(scanner, calculator);
                break;
            case 2:
                substractionOperation(scanner, calculator);
                break;
            case 3:
                multiplicationOperation(scanner,calculator);
                break;
            case 4:
                divisionOperation(scanner, calculator);
                break;
            default:
                exit = true;
        }
    }
    while (!exit);

    }

    private static void printInfo() {
        System.out.println("*******************");
        System.out.println("Choose operation: 1(+), 2(-), 3(*), 4(/) other number to exit");
        System.out.println("Enter");
    }

    private static void additionOperation(Scanner scanner, Calculator calculator) {
        int [] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.addition(twoNumbersFromInput[0],twoNumbersFromInput[1]);
        System.out.println(twoNumbersFromInput[0] + " + " + twoNumbersFromInput[1] + " = " + result);
    }

    private static void substractionOperation(Scanner scanner, Calculator calculator) {
        int [] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.subtraction(twoNumbersFromInput[0],twoNumbersFromInput[1]);
        System.out.println(twoNumbersFromInput[0] + " - " + twoNumbersFromInput[1] + " = " + result);
    }

    private static void multiplicationOperation(Scanner scanner, Calculator calculator) {
        int [] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.multiplication(twoNumbersFromInput[0],twoNumbersFromInput[1]);
        System.out.println(twoNumbersFromInput[0] + " * " + twoNumbersFromInput[1] + " = " + result);
    }

    private static void divisionOperation(Scanner scanner, Calculator calculator) {
        int [] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.division(twoNumbersFromInput[0],twoNumbersFromInput[1]);
        System.out.println(twoNumbersFromInput[0] + " / " + twoNumbersFromInput[1] + " = " + result);
    }

    private static int[] getTwoNumbersFromInput(Scanner scanner) {
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        return new int[]{firstNumber,secondNumber};
    }

    }

