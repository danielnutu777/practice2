package arrays;

import java.util.Arrays;

public class ArraysEx5 {

    public static void main(String[] args) {
        //my solution
        Integer[] x = {5345,345,354,345,23,12};
        int arrayIndex = Arrays.asList(x).indexOf(12);
        System.out.println(arrayIndex);
    }
}
//5.Write a Java program to find the index of an array element.