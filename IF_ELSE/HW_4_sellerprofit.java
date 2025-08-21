package IF_ELSE;

import java.util.Scanner;

public class HW_4_sellerprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost price :");
        int cp = sc.nextInt();
        System.out.print("Enter Selling price :");
        int sp = sc.nextInt();

//        if (sp>cp ) System.out.println("Profit is "+ (sp-cp));
//        if(sp<cp) System.out.println("Loss is "+ (cp-sp));
//        if (sp == cp) System.out.println("No Profit No loss");


        if (sp>cp ) System.out.println("Profit is "+ (sp-cp)); // else if only work when if donst work
        else if(sp<cp) System.out.println("Loss is "+ (cp-sp));
        else System.out.println("No Profit No loss");

    }
}
