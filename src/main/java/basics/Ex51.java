package basics;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s);
        System.out.println("The integer value is : " + x);
    }
}
/*51. Write a Java program to convert a string to an integer in Java.
Sample Output:

Input a number(string): 25
The integer value is: 25*/