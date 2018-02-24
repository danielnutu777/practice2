package basics;

import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String s = scanner.nextLine();

        System.out.println(s.substring(0 ,s.length() / 2));
    }
}
/*69. Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt*/