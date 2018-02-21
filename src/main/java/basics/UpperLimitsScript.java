package basics;

import java.util.Scanner;

public class UpperLimitsScript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter oldValue: ");
        int oldValue = scanner.nextInt();
        System.out.print("Enter tempValue: ");
        int tempValue = scanner.nextInt();
        System.out.print("Enter roundingValue: ");
        int roundingValue = scanner.nextInt();

        System.out.print("Enter operation(minus/plus): ");
        String s = scanner.next();

        switch(s){
            case "minus":
                int x = (oldValue - tempValue)/roundingValue;
                System.out.println(Math.round(x * roundingValue));
                break;
            case "plus":
                int y = (oldValue + tempValue)/roundingValue;
                System.out.println(Math.round(y * roundingValue));
        }
    }
}
