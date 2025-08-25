package Basic_chezze;

public class ASCIIVALUES {

    public static void main(String[] args) {

        
        // ASCII VALUES

//   a-97       A-65       0-48
//   z-122      Z-90       9-57


//Typecasting - ek data type se dossra data type conversion

        char rudra = 'A';
        int x = rudra; //implicit typecasting
        System.out.println(x);

        char Amy = 'a';
        int y = (int)Amy; //explicit typecasting
        System.out.println(y);

        char adi = '4';
        System.out.println(adi);

        char mizu = '4';
        System.out.println(mizu+0); //(mizu-29);     (mizu*mizu);     (mizu/84);



        //integer to chracter
        int z = 65;
        char ch = (char)z;
        System.out.println(ch);
    }
}
