package IF_ELSE;

import java.util.Scanner;

public class HW_10_highestdigit  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number : ");
        int a = sc.nextInt();

        System.out.print("Enter number : ");
        int b = sc.nextInt();

        System.out.print("Enter number : ");
        int c = sc.nextInt();

        if (a>=b && a>=c) System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);

        {

        }
    }
}
