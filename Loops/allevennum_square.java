package Loops;

import java.util.Scanner;

public class allevennum_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();


        for (int i = 1; i <=Math.sqrt(n)  ; i++) {
            if (n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
            
        }
    }
}
