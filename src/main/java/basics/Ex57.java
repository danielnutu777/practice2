package basics;

import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        int factors = 0;
        for (int i = x; i > 0; i--){
            if(x % i == 0){
                factors++;
            }
        }
        System.out.println(factors);
    }
}
/*57. Write a Java program to accepts an integer and count the factors of the number.
Sample Output:

Input an integer: 25
3*/