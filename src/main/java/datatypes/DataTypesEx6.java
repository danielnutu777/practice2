package datatypes;

import java.util.Scanner;

public class DataTypesEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble() * 0.45359237;
        System.out.print("Input height in inches: ");
        double height = scanner.nextDouble() * 0.0254;
        System.out.println(height);
        System.out.println(weight);
        System.out.println("BMI is: " + (weight/Math.pow(height, 2)));
    }
}
/*6. Write a Java program to compute body mass index (BMI).

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721*/