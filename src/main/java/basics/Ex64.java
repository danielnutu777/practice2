package basics;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();

        System.out.println(compareDigits(a, b));

    }
    public static boolean compareDigits(int a, int b) {

        if(a < 25 && b > 75){
            return false;
        }
        char[] aChar = Integer.toString(a).toCharArray();
        char[] bChar = Integer.toString(b).toCharArray();

        return (aChar[0] == bChar[0] || aChar[0] == bChar[1] || aChar[1] == bChar[1] || aChar[1] == bChar[0]);
    }
}
/*64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true*/