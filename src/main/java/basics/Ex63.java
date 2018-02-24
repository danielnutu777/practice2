package basics;

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();

        System.out.println(returnLargerNo(a, b));
    }
    public static int returnLargerNo(int a, int b){
        if(a > b){
            return a;
        }else if(b > a){
            return b;
        }else if (a == b){
            return 0;
        }else if(a > b && ((a % 6)==(b % 6))){
            return b;
        }else if(b > a && (a % 6)==(b % 6)){
            return a;
        }else
            return 234;
    }
}
/*63. Write a Java program that accepts two integer values from the user and return the larger values.
However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12
Input the second number: 13
Result: 13*/