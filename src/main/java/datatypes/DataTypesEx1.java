package datatypes;

import java.util.Scanner;

public class DataTypesEx1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double degreesF =  scanner.nextDouble();

        double degreesC = (degreesF - 32) * 5/9;
        System.out.println(degreesF + " degree Fahrenheit is equal to " + degreesC + " in Celsius");


    }
}
/*1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/