package basics;

import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String s = scanner.nextLine();

        char[] sArr = s.toCharArray();
        char ch = sArr[sArr.length - 1];
        char ch2 = sArr[sArr.length - 2];
        char ch3 = sArr[sArr.length - 3];

        String s2 = String.valueOf(ch3) + String.valueOf(ch2) + String.valueOf(ch);

        System.out.println(s2 + s2 + s2 + s2);

    }
}
/*68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
The length of the original string must be 3 and above.
Sample Output:

3.03.03.03.0 */