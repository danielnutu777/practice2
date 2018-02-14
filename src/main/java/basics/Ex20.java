package basics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimalNo = scanner.nextInt();

        List<Integer> remainderList = new ArrayList<>();
        while(decimalNo != 0) {
            int j = 0;
            int remainder = decimalNo % 16;
            int convertedRemainder;
            switch(remainder){
                case 10:
                    convertedRemainder = Integer.parseInt("A");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                case 11:
                    convertedRemainder = Integer.parseInt("B");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                case 12:
                    convertedRemainder = Integer.parseInt("C");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                case 13:
                    convertedRemainder = Integer.parseInt("D");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                case 14:
                    convertedRemainder = Integer.parseInt("E");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                case 15:
                    convertedRemainder = Integer.parseInt("F");
                    remainderList.add(j, convertedRemainder);
                    decimalNo /= 16;
                    j++;
                    break;
                default:
                    decimalNo /= 16;
                    remainderList.add(j ,remainder);
                    j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.reverse(remainderList);
        for(int i = 0; i < remainderList.size(); i++) {
            sb.append(i);
        }
        System.out.println("Hexadecimal number is: " + sb);
    }
}
/*20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F */