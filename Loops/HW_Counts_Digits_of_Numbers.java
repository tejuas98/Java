package Loops;

import java.util.Scanner;

public class HW_Counts_Digits_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if (n==0) ; n = 1;
        int count = 0;
        while (n !=0) {
            n /= 10;
            count++;   // loop kitni baar chal rha yeh batyaga

        }
        System.out.println(count);



    }
}
