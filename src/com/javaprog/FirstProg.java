package com.javaprog;

public class FirstProg {
    public static void main(String arg[])
    {
        int a=29;              // int 4 bytes  --> 32 bits
        short s=2;            //short 2 bytes --> 16 bits --> - 32468  to 32467
        byte b = 6;          // byte 1 byte --> 8 bits --> - 128 to 127
        double d=5.5;     // double 4 bytes
        float f=5.5f;         //float 4 bytes
        long l=5000000000l;  // 8 bytes

        char c = 'B';    //Char returns ASCII(American standard  code for information interchange) VALUE
        c = 65;
        System.out.println("Welcome to intellij");
        System.out.println(a);
        System.out.println(s);
        System.out.println(f);
        System.out.println(l);
        System.out.println(b);
        System.out.println(c);

        double d1=5; // implicit conversion --> the value will automatically convert into double as --> 5.0
        System.out.println(d1);
        int i=(int) 10.2;   /* Type Casting --> the double value which will be converted into a integer value using type casting
        and done explicitly*/
        System.out.println(i);
    }
}

/*WE CAN ASSIGN VALUES AS FOLLOWS
Byte --> Short -- > int --> long-->float--> double
                  &
               char
 */