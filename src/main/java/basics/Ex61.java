package basics;

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String s = scanner.nextLine();

        char[] stringS = s.toCharArray();
        for(int i = stringS.length - 1; i >= 0; i--){
            System.out.print(stringS[i]);
        }
    }
}
/*61. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd*/