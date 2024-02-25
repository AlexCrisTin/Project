package com.mycompany.app.EX;

public class bt5 {
    public static void main(String[] args) {
       int x = 100101010;
       int y = 011100101;
         System.out.println("x: " + Integer.toBinaryString(x));
        System.out.println("y: " + Integer.toBinaryString(y));

   
        System.out.println("x & y: " + Integer.toBinaryString(x & y));
        System.out.println("x | y: " + Integer.toBinaryString(x | y));
        System.out.println("x ^ y: " + Integer.toBinaryString(x ^ y));
        System.out.println("~x: " + Integer.toBinaryString(~x));
        System.out.println("~y: " + Integer.toBinaryString(~y));

}
}