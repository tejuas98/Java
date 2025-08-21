package IF_ELSE;

import java.util.Scanner;
//take psotitive integer input  and     tell if it is divisble  by 5 or 3 .
public class HW_7_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number divisible by 5 and 3 :");
        int x = sc.nextInt();
        if (x%5 ==0 || x%3 ==0){  // for or use ||
            System.out.println("yes ");
        }
        else {
            System.out.println("No");
        }
    }
}
