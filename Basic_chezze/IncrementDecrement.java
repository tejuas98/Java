package Basic_chezze;

public class IncrementDecrement {

    public static void main(String[] args) {

        int x = 10
        System.out.println(x);

        x += 50;
        System.out.println(x);

        x -=20;
        System.out.println(x);

        x *=5;
        System.out.println(x);

        int x = 10;
        System.out.println(x++);      System.out.println(x);

        x *=5;
        System.out.println(x);

        int x = 10;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);


        int x = 10;
        int y =x++;  // y become 10 after using in y , that neans now in this row x in 11
        System.out.println(x+" "+y);

        int w = 10;
        int v =++w;
        System.out.println(w+" "+v);
    }
}
