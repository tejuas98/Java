package Patten_Printing;

import java.util.Scanner;

public class Hollow_starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mo. Of Rows : ");
        int m = sc.nextInt();
        System.out.print("Enter mo. Of Colums : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==m/2+1 || i==m || j==n/2+1 || j==n)
                    System.out.print("* ");
                else System.out.print("  ");


            }
            System.out.println();

        }
    }
}
