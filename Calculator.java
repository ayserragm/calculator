/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ayseserra
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("------- Hello ---------");
        System.out.println("=======================");
        while (true) {
            System.out.print("What you want to do: ");//The user is asked what action she wants to take.
            int todo = scanner.nextInt();
            if (todo == 0) {
                System.out.println("Stop");
                System.out.println("=========================");
                System.out.println("-------- Thanks ----------");
                System.out.println("=========================");
                break;
            }
            switch (todo) { //The number of operations are entered in this function.
                case 1:
                    sum(scanner);
                    break;
                case 2:
                    subtract(scanner);
                    break;
                case 3:
                    product(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    factorial(scanner);
                    break;
                case 6:
                    summation(scanner);
                    break;
                case 7:
                    sumArrays(scanner);
                    break;
                case 8:
                    isPrime(scanner);
                    break;
                case 9:
                    isInArray(scanner);
                    break;
                case 10:
                    standardDeviation(scanner);
                    break;
                default:
                    System.out.println("this is an invalid operation.");
            }
            System.out.println("=======================");
            System.out.println("=========================");//The user whose job is finished will be bid farewell.
            System.out.println("------- Thanks -----------");
            System.out.println("=========================");
        }
    }

    public static void sum(Scanner scanner) {//2,3 or 4 numbers are summed in this function.
        System.out.print("How many numbers for sum: ");
        int hmnums = scanner.nextInt();
        if (hmnums == 2) {//this section is for sum of 2 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.println("Result = " + sum(num1, num2));
        } else if (hmnums == 3) {//this section is for sum of 3 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter Number 3: ");
            double num3 = scanner.nextDouble();
            System.out.println("Result = " + sum(num1, num2, num3));
        } else if (hmnums == 4) {//this section is for sum of 4 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter Number 3: ");
            double num3 = scanner.nextDouble();
            System.out.print("Enter Number 4: ");
            double num4 = scanner.nextDouble();
            System.out.println("Result = " + sum(num1, num2, num3, num4));
        }
    }

    public static int sum(double num1, double num2) {
        return (int) (num1 + num2);
    }

    public static int sum(double num1, double num2, double num3) {
        return (int) (num1 + num2 + num3);
    }

    public static int sum(double num1, double num2, double num3, double num4) {
        return (int) (num1 + num2 + num3 + num4);
    }

    public static void subtract(Scanner scanner) {//2,3 or 4 numbers are substracted in this function.
        System.out.print("How many numbers for subtraction: ");
        int hmnums = scanner.nextInt();

        if (hmnums == 2) {//this section is for substraction of 2 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.println("Result = " + subtract(num1, num2));
        } else if (hmnums == 3) { //this section is for substraction of 3 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter Number 3: ");
            double num3 = scanner.nextDouble();
            System.out.println("Result = " + subtract(num1, num2, num3));
        } else if (hmnums == 4) { //this section is for substraction of 4 numbers.
            System.out.print("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Number 2: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter Number 3: ");
            double num3 = scanner.nextDouble();
            System.out.print("Enter Number 4: ");
            double num4 = scanner.nextDouble();
            System.out.println("Result = " + subtract(num1, num2, num3, num4));

        }
    }

    public static int subtract(double num1, double num2) {
        return (int) (num1 - num2);
    }

    public static int subtract(double num1, double num2, double num3) {
        return (int) (num1 - num2 - num3);
    }

    public static int subtract(double num1, double num2, double num3, double num4) {
        return (int) (num1 - num2 - num3 - num4);
    }

    public static void product(Scanner scanner) { //2 integers are multiplied in this section.
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Result = " + product(num1, num2));

    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static void division(Scanner scanner) {//2 float numbers are divided into each other in this function.
        System.out.print("Enter Number 1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter Number 2: ");
        float num2 = scanner.nextFloat();
        if (num2 == 0) {
            System.out.println("Number 0 causes error.Please choose a different number.");// if num 2 is 0, it become undefined.
        } else {
            System.out.println("Result = " + division(num1, num2));
        }
    }

    public static float division(float num1, float num2) {
        return (float) num1 / num2;
    }

    public static void factorial(Scanner scanner) { // In this function, the factorial of the entered number is calculated.
        System.out.print("Enter one number for factorial:");
        int num = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Result = " + result);
    }

    public static void summation(Scanner scanner) { //the summation of the numbers between two selected numbers are computed in this function.
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();
        int summation = 0;
        if (num1 < num2) {//This section works if the first number entered is less than the second number entered.
            for (int i = 0; i <= num2; i++) {
                summation = ((num2 * (num2 + 1)) / 2) - (((num1 - 1) * (num1)) / 2);
            }
        } else {//otherwise this function works. Confusion is avoided by using if
            for (int j = 0; j <= num1; j++) {
                summation = ((num1 * (num1 + 1)) / 2) - (((num2 - 1) * (num2)) / 2);
            }
        }
        System.out.println("Result = " + summation);

    }

    public static void sumArrays(Scanner scanner) { //2 arrays are summed in this function.
        System.out.println("Enter the size of the arrays: ");//In this section, the size of the array is determined.
        int sizeofArray = scanner.nextInt();
        int[] arr1 = new int[sizeofArray];
        int[] arr2 = new int[sizeofArray];
        System.out.println("Enter elements of the 1. array: ");//It is requested to enter the elements of the first array.
        for (int i = 0; i < sizeofArray; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of the 2nd array: ");//It is requested to enter the elements of the second array.
        for (int i = 0; i < sizeofArray; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] result = new int[sizeofArray];
        for (int i = 0; i < sizeofArray; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        System.out.print("Result:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static void isPrime(Scanner scanner) { //This function determines whether a number is prime or not.
        System.out.print("Enter a number to search for it:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void isInArray(Scanner scanner) {//this function test if a number is in an array or not.
        System.out.println("Enter the size of the array: ");////In this section, the size of the array is determined.
        int sizeofArray = scanner.nextInt();
        int[] arr = new int[sizeofArray];
        System.out.println("Enter the elements of the array: "); //It is requested to enter the elements of the array.
        for (int i = 0; i < sizeofArray; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to search for: ");
        int num = scanner.nextInt();
        boolean found_it = false;
        for (int i = 0; i < sizeofArray; i++) {
            if (arr[i] == num) {
                found_it = true;
                break;
            }
        }
        if (found_it) {
            System.out.println(num + " is in our array.");
        } else {
            System.out.println(num + " is not in our array.");
        }
    }

    public static void standardDeviation(Scanner scanner) { //The Standard Deviation of a set of 100 numbers in an array is computed in this function.

        int[] nums = new int[100];
        System.out.println("Enter 100 numbers: ");
        for (int i = 0; i < 100; i++) {
            nums[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double mean = sum / nums.length;
        double sqrdDiffSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sqrdDiffSum += (nums[i] - mean) * (nums[i] - mean);
        }
        double variance = sqrdDiffSum / nums.length;
        double standardDev = Math.sqrt(variance);
        System.out.println("The standard deviation is: " + standardDev);
    }

}
