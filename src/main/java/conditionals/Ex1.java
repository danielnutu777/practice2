package conditionals;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n - 1;
        int z = 0;
        for (int i = 0; i < n; i++) {
            for (int j = m; j > 0; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= z; l++) {
                System.out.print("*");
            }
            System.out.println();
            z += 2;
            m--;
        }
        int q = n - 1;
        int c = 0;
        for(int t = 0; t < n; t++){
            for(int y = q; y > 0; y--){
                System.out.print("*");
            }
            for(int x = 0; x <= c; x++){
                System.out.print(" ");
            }
            System.out.println();
            c += 2;
            q--;
        }
    }
}
/*21. Write a program in Java to display the pattern like a diamond. Go to the editor

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :


      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
  */