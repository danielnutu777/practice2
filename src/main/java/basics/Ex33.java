package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int x = scanner.nextInt();

        List<Integer> listOfDigits = new ArrayList<>();
        while(x > 0){
            int i = 0;
            listOfDigits.add(i, x % 10);
            x /= 10;
            i++;
        }
        int sum = 0;
        for (int i = 0; i < listOfDigits.size(); i++){
            sum += listOfDigits.get(i);
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
/*33. Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/