package Loops;

import java.util.Scanner;

public class HW_DisplayAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        
        // 2,5,8,12,15....
//        for (int i = 2; i <=3*n-1 ; i+=3) {
//            System.out.print(i + " ");
//        }

        // 4,10,16,22,28
        int a = 2, d=3;
        for (int i = 0; i <=n ; i++) {
            System.out.print(a+" ");
            a +=d;
            
        }
        
    }
}
