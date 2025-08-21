package IF_ELSE;

import java.util.Scanner;

public class HW_9 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);      //use ! for not
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        if (x%5 ==0 && x%3==0) System.out.println("divsible by both");
        else if (x%3==0) System.out.println("yes by 3");
        else if (x%5 ==0 ) System.out.println("yes by 5");
        else System.out.println("not divisble");
    }
}
