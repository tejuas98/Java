package Patten_Printing;

import java.util.Scanner;

public class print__abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(j+96) +" ");

            }
            System.out.println();
        }
    }
}
