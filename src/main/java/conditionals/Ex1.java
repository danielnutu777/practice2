package conditionals;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = scanner.nextInt();


        for (int i = 1; i <= input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("\t" + i + "\t");
            }
            System.out.println();
        }
    }
}
/*19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor

       1
      2 2
     3 3 3
    4 4 4 4
Click me to see the solution */