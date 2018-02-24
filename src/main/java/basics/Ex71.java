package basics;

public class Ex71 {
    public static void main(String[] args) {
        String s = "Python";
        String s2 = "Tutorial";
        System.out.println(s.substring(1, s.length()) + s2.substring(1, s2.length()));
    }
}
/*71. Write a Java program to create the concatenation of the two strings except removing the first character of each string.
The length of the strings must be 1 and above.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial*/