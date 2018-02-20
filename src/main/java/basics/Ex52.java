package basics;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();
        if(a + b == c){
            System.out.println("The result is: true");
        }

    }
}
/*52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true*/