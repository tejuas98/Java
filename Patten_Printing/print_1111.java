package Patten_Printing;

import java.util.Scanner;

public class print_1111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i + " ");  // j ki jagah i kridya bas

            }
            System.out.println();
        }
    }
}
