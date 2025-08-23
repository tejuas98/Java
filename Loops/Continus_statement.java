package Loops;

import java.util.Scanner;

public class Continus_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        for (int i = 1; i <=100 ; i++) {
            if (i%2 ==1) {
                continue; //continue means skip this itrations
            }
            System.out.print(i+" ");


        }
    }
}
