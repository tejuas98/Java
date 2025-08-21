package IF_ELSE;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int  x = sc.nextInt();
        if(x%5==0) {
            System.out.println("Yes this number is divisble by 5");
        }
        else {
            System.out.println("No this number is divisble by 5");
        }
    }
}
