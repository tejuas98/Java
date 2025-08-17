package IF_ELSE;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int m = sc.nextInt();
        if(m%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");

    }
}
