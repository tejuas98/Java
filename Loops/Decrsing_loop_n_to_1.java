package Loops;

import java.util.Scanner;

public class Decrsing_loop_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();


        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
            
        }
    }
}
