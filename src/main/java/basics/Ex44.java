package basics;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int x = scanner.nextInt();
        System.out.println(x + " + " + x + x + " + " + x + x + x);
    }
}
/*44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5
5 + 55  + 555*/