package IF_ELSE;

import java.util.Scanner;

public class HW_5_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit No :");
        int x = sc.nextInt();
        if (x >999 && x<100000) //for and use &&
        System.out.println("Yes this is a 4 digit Number");
        else System.out.println("Not a 4 digit Number");

    }
}
