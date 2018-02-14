package basics;

public class Ex13 {
    private static final double WIDTH = 5.6d;
    private static final double HEIGHT = 8.5d;

    public static void main(String[] args) {
        //my solution
        double perimeter = 2 * (WIDTH + HEIGHT);
        double area = WIDTH * HEIGHT;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

        //provided solution
        System.out.printf("Perimeter is: 2 *(%.1f + %.1f) = %.2f ", HEIGHT, WIDTH, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", HEIGHT, WIDTH, area);
    }
}
/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/