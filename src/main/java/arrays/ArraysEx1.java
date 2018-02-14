package arrays;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        // my solution
        int[] x = {2,34,4564,24,17,67};
        Arrays.sort(x);
        for (int i = 0; i<x.length;i++){
            System.out.println(x[i]);
        }

        String[] s = {"csdf", "fhgh", "aars", "uiojh", "vmbnm"};
        Arrays.sort(s);
        for (int i=0; i < s.length; i++){
            System.out.println(s[i]);
        }
        //provided solution
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(s));
    }
}
//1.Write a Java program to sort a numeric array and a string array.