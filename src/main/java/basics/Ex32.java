package basics;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstNo = scanner.nextInt();

        System.out.print("Input second integer: ");
        int secondNo = scanner.nextInt();
        if (firstNo != secondNo && firstNo <= secondNo) {
            System.out.println(firstNo + " != " + secondNo);
            System.out.println(firstNo + " < " + secondNo);
            System.out.println(firstNo + " <= " + secondNo);
        }
    }
}
/*32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39*/