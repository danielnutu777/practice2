package basics;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("The string is: ");
        String s = scanner.nextLine();

        int letterCounter = 0;
        int spaceCounter = 0;
        int noCounter = 0;
        int otherCharCounter = 0;

        char temp;
        for (int i = 0; i < s.length(); i++){
            temp = s.charAt(i);
            if (Character.isDigit(temp)){
                noCounter += 1;
            }else if (Character.isLetter(temp)) {
                letterCounter += 1;
            }else if (Character.isSpaceChar(temp)){
                spaceCounter += 1;
            }else{
                otherCharCounter += 1;
            }
        }
        System.out.print("Letter: " + letterCounter + "\n" + "Spaces: " + spaceCounter + "\n" + "Numbers: " + noCounter + "\n" + "Others: " + otherCharCounter + "\n");

    }
}
/*38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6*/