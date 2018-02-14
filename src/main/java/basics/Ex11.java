package basics;

public class Ex11 {
    private static final double RADIUS = 7.5d;
    public static void main(String[] args) {
        //my solution
        double radius = 7.5d;
        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        //provided solution
        double perimeter2 = Math.PI * 2 * RADIUS;
        double area2 = Math.PI * RADIUS *RADIUS;
        System.out.println("Perimeter is = " + perimeter2);
        System.out.println("Area is = " + area2);

    }
}
/*11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/