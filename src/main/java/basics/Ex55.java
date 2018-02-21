package basics;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int x = scanner.nextInt();

        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int seconds = (x % 3600) % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
/*55. Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:

Input seconds: 86399
23:59:59*/