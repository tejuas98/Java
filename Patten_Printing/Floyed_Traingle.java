package Patten_Printing;

import java.util.Scanner;

public class Floyed_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int a = 1;
                for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++ + " ");


            }
            System.out.println();

        }
    }
}
