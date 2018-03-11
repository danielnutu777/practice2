package datatypes;

import java.util.Scanner;

public class DataTypesEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();
        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        double metersPerSecond = distance / ((hour * 3600) + (minutes * 60) + seconds) ;
        System.out.println(metersPerSecond);
        double kmPerHour = (distance / 1000) / ((hour * 3600) + (minutes * 60) + seconds) * 3600;
        System.out.println(kmPerHour);
        double milesPerHour = (distance / 1609) / ((hour * 3600) + (minutes * 60) + seconds) * 3600;
        System.out.println(milesPerHour);
    }
}
/*7. Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
(hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804*/