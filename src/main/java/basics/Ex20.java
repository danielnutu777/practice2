package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        //my solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimalNo = scanner.nextInt();

        List<Integer> remainderList = new ArrayList<>();
        while (decimalNo != 0) {
            int j = 0;
            int remainder = decimalNo % 16;
            decimalNo /= 16;
            remainderList.add(j, remainder);
            j++;
        }

        List<String> remainderStringList = new ArrayList<>(remainderList.size());
        for (int i : remainderList) {
            remainderStringList.add(String.valueOf(i));
        }
        for (int i = 0; i < remainderStringList.size(); i++) {
            switch (remainderStringList.get(i)) {
                case "10":
                    remainderStringList.set(i, "A");
                    break;
                case "11":
                    remainderStringList.set(i, "B");
                    break;
                case "12":
                    remainderStringList.set(i, "C");
                    break;
                case "13":
                    remainderStringList.set(i, "D");
                    break;
                case "14":
                    remainderStringList.set(i, "E");
                    break;
                case "15":
                    remainderStringList.set(i, "F");
                    break;
                default:
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < remainderStringList.size(); i++) {
            sb.append(remainderStringList.get(i));
        }
        System.out.println("Hexadecimal number is: " + sb);
    }
}
/*20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F */