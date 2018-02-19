package basics;

import java.util.ArrayList;
import java.util.List;

public class Ex50 {
    public static void main(String[] args) {
        List<Integer> div3 = new ArrayList<>();
        List<Integer> div5 = new ArrayList<>();
        List<Integer> div3And5 = new ArrayList<>();

        for (int i = 1; i < 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                int z = 0;
                div3And5.add(z, i);
                z++;
            }else if(i % 5 == 0){
                int y = 0;
                div5.add(y, i);
                y++;
            }else if(i % 3 == 0){
                int x = 0;
                div3.add(x, i);
                x++;
            }
        }
        System.out.println("Divided by 3: ");
        for(int j = 0; j < div3.size(); j++){
            System.out.print(div3.get(j) + " ,");
        }
        System.out.println("\nDivided by 5: ");
        for(int k = 0; k < div5.size(); k++){
            System.out.print(div5.get(k) + " ,");
        }
        System.out.println("\nDivided by 3 & 5: ");
        for (int l = 0; l < div3And5.size(); l++){
            System.out.print(div3And5.get(l) + " ,");
        }
        System.out.println();
        System.out.println(div3.size());
    }
}
/*50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
Sample Output:

Divided by 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divided by 3 & 5:
15, 30, 45, 60, 75, 90,*/
