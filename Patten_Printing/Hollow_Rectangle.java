package Patten_Printing;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int m = sc.nextInt(); //rows
        System.out.print("Enter No of Colums : ");

        int n = sc.nextInt(); // columss

        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1 || i==m || j==1 || j==n)
                System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
