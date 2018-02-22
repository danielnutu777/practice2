package basics;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scanner.nextLine();
        String[] s2 = s.split(" ");
        String penultimateWord = s2[s2.length - 2];
        System.out.println(penultimateWord);
    }

}

/*60. Write a Java program to find the penultimate (next to last) word of a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy*/