package basics;

import java.util.Scanner;

public class Ex54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();

        int lastDigitOfa = getlastDigit(a);
        int lastDigitOfb = getlastDigit(b);
        int lastDigitOfc = getlastDigit(c);

        System.out.println("The result is: " + compareLastDigits(lastDigitOfa, lastDigitOfb, lastDigitOfc));
    }
    public static boolean compareLastDigits(int x, int z, int y){

        return x == z || x == y || z == y;
    }

    public static int getlastDigit(int x) {
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();
        char lastDigit = ch[ch.length - 1];
        int lastDigitInt = (int) lastDigit;

        return lastDigitInt;
    }
}
/*54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers )
have the same rightmost digit. The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true*/