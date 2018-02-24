package basics;

public class Ex67 {
    public static void main(String[] args) {
        String s = "Python 3.0";
        String[] sArr = s.split(" ");
        System.out.println(sArr[0] + " Tutorial " + sArr[1]);
    }
}
/*67. Write a Java program to insert a word in the middle of the another string. Go to the editor
 Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
 Sample Output:

 Python Tutorial 3.0*/