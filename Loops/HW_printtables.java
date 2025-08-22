package Loops;

import java.util.Scanner;

public class HW_printtables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Table : ");
        int x = sc.nextInt();

//        170 interactions in loop
//        for (int i = 17; i <= 170 ; i++) {
//          if (i % 17==0)  System.out.println(i);

//        for (int i = 17; i <=170; i=i+17) {
//            System.out.println(i);
//
//        }

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i*x+" ");

        }


    }
}
