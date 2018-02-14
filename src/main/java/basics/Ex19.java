package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();

        List<Integer> remaindersList = new ArrayList<>();
        int j = 0;
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            decimalNumber /= 2;
            remaindersList.add(j, remainder);
            j++;
        }
        Collections.reverse(remaindersList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < remaindersList.size(); i++) {
            sb.append(remaindersList.get(i));
        }
        System.out.println("Binary Number is: " + sb);
    }
}
/*19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 */