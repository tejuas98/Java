package IF_ELSE;

import java.util.Scanner;

public class HW_8_Sidesofatraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First side : ");
        int a = sc.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.print("Enter Second side : ");
        int b = sd.nextInt();

        Scanner se = new Scanner(System.in);
        System.out.print("Enter Third side : ");
        int c = se.nextInt();

        if (a+b>c && b+c>a && c+a>b){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invaid");
        }

    }
}
