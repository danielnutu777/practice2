package basics;

public class Ex15 {
    public static void main(String[] args) {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+ a +" , " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+ a + " , " + b);
    }
}
/*15. Write a Java program to swap two variables. */