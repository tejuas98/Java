package Loops;

import java.util.Scanner;

public class Reverse_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        int n = sc.nextInt();
        int r = 0;
        while (n!=0){
            r*=10;
            r+=(n%10);
            n/=10;
        }
        System.out.println(r);

    }
}
