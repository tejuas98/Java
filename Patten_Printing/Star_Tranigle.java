package Patten_Printing;

import java.util.Scanner;

public class Star_Tranigle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();



        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");   // if we put j insted of star we will get 1
                                          //                                        1 2 3
                                          //                                        1 2 3 4
            }
            System.out.println();

        }
    }
}
