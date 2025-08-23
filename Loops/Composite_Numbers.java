package Loops;

import java.util.Scanner;

public class Composite_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

//        for (int i = 2; i <=n-1 ; i++) {
//            if (n%i ==0){           // 'i' tp 'n' la ek factor nikla
//                System.out.println("Composite Number");
//            }
//                break;


        boolean flag =  true ; // 0 means prime
        for (int i = 2; i <=n-1 ; i++) {
            if (n%i ==0)            // 'i' tp 'n' la ek factor nikla
             flag = false ; // 1 means composite

            break;
        }
        if (n==1) System.out.println("Neither Composite nor Prime Number");
        else if ((flag==false)) {
            System.out.println("Composite Number");
        }
        else System.out.println("Prime Number");


    }

}
