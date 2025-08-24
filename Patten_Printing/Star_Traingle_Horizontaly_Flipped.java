package Patten_Printing;

import java.util.Scanner;

public class Star_Traingle_Horizontaly_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) { //just added n+1-i
                System.out.print("*" +" ");

            }
            System.out.println();
        }
    }
}
