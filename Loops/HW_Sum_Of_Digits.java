package Loops;

import java.util.Scanner;

public class HW_Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0;
        if (n<0) n = -n;

        while (n !=0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n /= 10;
        }
            System.out.println(sum);
//        System.out.println( (sum>0)  ? sum : -sum );
        }
    }

