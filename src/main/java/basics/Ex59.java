package basics;

import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scanner.nextLine();
        String s2 = s.toLowerCase();
        System.out.println(s2);
    }
}
/*59. Write a Java program to convert a given string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.*/