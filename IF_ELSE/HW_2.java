package IF_ELSE;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
// q : write a code that give  positer number if we right positive int , make positive int when we give negative and print
        int x = sc.nextInt(); //absoulte value
//        if (x >= 0) {
//            System.out.println(x);
//        }
//        else System.out.println(-x);

        // 2nd method
        if (x<0) x = -x;
        System.out.println(x);
    }
}
