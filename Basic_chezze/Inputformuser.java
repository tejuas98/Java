package Basic_chezze;

import java.util.Scanner;

public class Inputformuser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // scanner is used to make inputes

        System.out.println("To find area of circle");
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r ;
        System.out.print("Area is : ");

        System.out.println(a);


        System.out.println("Square of the number");
        System.out.print("Enter Value : ");
        double s = sc.nextDouble();
        double p = s * s;
        System.out.print("Square is  : ");
        System.out.println(p);

       int o1 = sc.nextInt(); //sum
       int o2=sc.nextInt();
       int o3 =sc.nextInt();

        System.out.println(o1+o2+o3);
    }
}
