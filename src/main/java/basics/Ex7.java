package basics;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //solution
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        //provided solution
        for (int j = 0; j < 10; j++){
            System.out.println(num + " x " + (j + 1) + " = " + num * (j + 1));
        }
    }
}
/*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/