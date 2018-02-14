package arrays;

public class ArraysEx3 {
    public static void main(String[] args) {
        //my solution
        String[] s = {"- - - - - - - - - -"};
        for (int i = 0; i < 10; i++) {
            System.out.println(s[0]);
        }
        //provided solution
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }

    }
}

//3. Write a Java program to print the following grid.
    /*Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -  */
