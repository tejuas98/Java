package IF_ELSE;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

//       int prasan;
//       if (n>=0) prasan = 100 ;
//       else prasan = 0;

        int rudra = (n>= 0) ? 100 : 0;

        System.out.println(rudra);





    }
}
