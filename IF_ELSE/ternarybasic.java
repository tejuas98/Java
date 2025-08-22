package IF_ELSE;

import java.util.Scanner;

public class ternarybasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = sc.nextInt();

//        if (x%2 == 0 ) System.out.println("Even Number");
//        else System.out.println("Odd Number");

        // condition ? sach : jhoot
        System.out.println((x%2 == 0 ) ? "Even" : "Odd");   //this is ternary oprater


    }
}
