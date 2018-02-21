package basics;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter third number: ");
        int z = scanner.nextInt();

        int i;
        int j;
        int k;

        if (x > y && x > z){
            j = x;
            i = y;
            k = z;
        }else if (y > x && y > z){
            j = y;
            i = x;
            k = x;
        }else{
            j = z;
            i = x;
            k = y;
        }
        for(i = i;i<=j;i++){
            if(i % k == 0){
                System.out.println(i);
            }
        }
    }
}
/*56. Write a Java program to find the number of integers within the range of two specified numbers and that are divisible
by another number. For example x = 5, y=20 and p =3, find the number of integers within the range x..y and
that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:
5
*/