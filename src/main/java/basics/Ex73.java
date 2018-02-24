package basics;

import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        String s = scanner.nextLine();
        System.out.print("Input second string: ");
        String s2 = scanner.nextLine();
        if(s.length() == 0){
            s = "#";
        }else if (s2.length() == 0){
            s2 = "#";
        }
        System.out.println(s.substring(0, 1) + s2.substring(s2.length() - 1));
    }
}
/*73. Write a Java program to create a new string taking first and last characters from two given strings.
If the length of either string is 0 use "#" for missing character.
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#*/