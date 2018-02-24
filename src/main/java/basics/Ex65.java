package basics;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();

        if (a > b){
            int c = a/b;
            System.out.println(a - (c * b));
        }else{
            int c = b/a;
            System.out.println(b - (c * a));
        }

    }
}
/*65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19
Input the second number: 7
5   */