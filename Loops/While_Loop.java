package Loops;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
