package basics;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        //my solution = provided solution
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number is: ");
        int num1  = scanner.nextInt();

        System.out.print("Second number is: ");
        int num2 = scanner.nextInt();

        System.out.print("Third number is: ");
        int num3 = scanner.nextInt();

        System.out.println("The average is: " + (num1 + num2 + num3) / 3);
    }
}
/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/