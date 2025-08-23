package Loops;

import java.util.Scanner;

public class HW_alpbatewithascllvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = n; i <=90 ; i++) {
            System.out.println((char)i + " " + i);
            
        }
    }
}
