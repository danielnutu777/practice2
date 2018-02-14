package arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        //my solution
        int sum = 0;
        int[] x = {23,5,546,12,67,34};
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        System.out.println(sum);
        //provided solution
        int sum2 = 0;
        for (int i : x) {
            sum2+= i;
        }
        System.out.println(sum2);
    }
}
//2. Write a Java program to sum values of an array.