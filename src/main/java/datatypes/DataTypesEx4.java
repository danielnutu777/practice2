package datatypes;

import java.util.Scanner;

public class DataTypesEx4 {
    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        int years = (int)minutes / 525600;
        int days = ((int)minutes % 525600) / 1440;
        System.out.println(years + "and" + days);
    }
}
/*4. Write a Java program to convert minutes into a number of years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days*/