package IF_ELSE;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real Number :"); //is integer
        double x = sc.nextDouble(); // x= -4.5757
        int y =(int)x; // y = 4
        if (x-y == 0) { // -4.5757 - 4 ==
            System.out.println("yes an integer");
        }
        else System.out.println("not an integer");
    }
}
