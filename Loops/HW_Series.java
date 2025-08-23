package Loops;

import java.util.Scanner;

public class HW_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int a = 99 , d = -4;
        for (int i = 0; i <=n ; i++) {
            System.out.print(i + " ");
            a+=d;
        }
    }
}
