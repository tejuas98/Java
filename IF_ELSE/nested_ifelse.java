package IF_ELSE;

import java.util.Scanner;

public class nested_ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number : ");
        int a = sc.nextInt();

        System.out.print("Enter number : ");
        int b = sc.nextInt();

        System.out.print("Enter number : ");
        int c = sc.nextInt();

//        if (a>b && a>c){
//            System.out.println(a);
//        }
//
//        else { // now this will test its b or c ?
//            if (b > a && b > c) System.out.println(b);
//            else System.out.println(c);

        if (a >= b) {
            if (a >= c) System.out.println(a);
            else  // c > a
                System.out.println(c);
        } else { // b > a
            if (b >= c) System.out.println(b);
            else // c > b
                System.out.println(c);
        }
    }
}
