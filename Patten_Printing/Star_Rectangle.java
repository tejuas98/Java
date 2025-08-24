package Patten_Printing;

import java.util.Scanner;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. Of Rows : ");
        int row = sc.nextInt();
        
        System.out.print("Enter no. Of Rows : ");
        int col = sc.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {  // kitni lines print hogi
                System.out.print("* "); //necate loop   //har line mai kitna print hoga
            }
            System.out.println();
            
        }


    }
}
