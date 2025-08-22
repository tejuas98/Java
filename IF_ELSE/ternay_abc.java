package IF_ELSE;

import java.util.Scanner;

public class ternay_abc {
    public static void main(String[] args) {

        // FIND THE HIGHEST INT BY GIVEN INPUTS

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter Number 3 : ");
        int c = sc.nextInt();



        int rudra =(a>b)? ((a>c) ? a:c) : ((b>c) ? b:c );

        System.out.println(rudra);
    }
}
