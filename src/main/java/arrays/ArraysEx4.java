package arrays;

public class ArraysEx4 {
    public static void main(String[] args) {
        //my solution
        int[] x = {12,3,13,457,789,736,4768478};
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            sum+=x[i];
        }
        double avg = sum / x.length;
        System.out.println(avg);
        //provided solution
    }
}
//4. Write a Java program to calculate the average value of array elements.
