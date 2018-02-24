package basics;

import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if (s.length() < 3){
            System.out.println("###");
        }else{
            System.out.println(s.substring(0, 3));
        }
    }
}
/*72. Write a Java program to create a new string taking first three characters from a given string.
If the length of the given string is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:

###*/