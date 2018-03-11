package datatypes;

import java.util.Scanner;

public class DataTypesEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inchVal = scanner.nextDouble();
        System.out.println(inchVal + " inch is " + inchVal * 0.0254);

        
    }
}
/*2. Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters*/