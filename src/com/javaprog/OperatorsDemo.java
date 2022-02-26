package com.javaprog;

public class OperatorsDemo {
    /*Arithmatic Operator -- > +,-,%,*,/
    bitwise
    relational
    logical
     */
    public static void main(String args[]) {
        int x = 10, y = 5;
        int m=6 , n=4;
        n++;  // n+ = 1 , n = n+1 shorthand or Increment Operator
        m--;   // n- = 1, n = n-1 Decrement Operator
        System.out.println(n);  // o/p --> 5
        System.out.println(m);  // o/p --> 5
        int p1 = x + y; // expecting output 15
        int p2 = x - y; // expecting output 5
        int p3 = x * y; // expecting output 50
        int p4 = x / y; // expecting output 2
        int p5 = x % y; // expecting output 0
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


    }
}