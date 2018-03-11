package datatypes;

import java.util.Scanner;

public class DataTypesEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st integer: ");
        int firstInt = scanner.nextInt();
        System.out.print("Input the 2nd integer: ");
        int secondInt = scanner.nextInt();

        System.out.println(Math.abs(firstInt - secondInt));

    }
}
/*9. Write a Java program that accepts two integers from the user and then prints the sum,
 the difference, the product, the average, the distance (the difference between integer),
 the maximum (the larger of the two integers), the minimum (smaller of the two integers).

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5*/