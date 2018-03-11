package datatypes;

import java.util.Scanner;

public class DataTypesEx3 {
    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");

        int input = scanner.nextInt();
        char[] inputArr = String.valueOf(input).toCharArray();
        int total = 0;
        for (int i = 0; i < inputArr.length; i++){
            total += Character.getNumericValue(inputArr[i]);
        }
        System.out.println("The sum of all digits in " + input + " is " + total);
        //provided solution
        Scanner input2 = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input2.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16*/