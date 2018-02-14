package basics;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Input first number: " + a);
        System.out.println("Input second number: " + b);
        System.out.println(a + " x " + b + " = " + a * b);

        //provided solution
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input first number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
/*5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/