package conditionals;

import java.util.Scanner;

public class ConditionalsEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0){
            System.out.println("Number is positive!");
        }else if (input < 0){
            System.out.println("Number is negative!");
        }else{
            System.out.println("Number is 0!");
        }
    }
}
/*1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive*/