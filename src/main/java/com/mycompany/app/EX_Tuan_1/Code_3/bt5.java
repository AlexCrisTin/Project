package com.mycompany.app.EX_Tuan_1.Code_3;

public class bt5 {
    public static void main(String[] args) {
      int x = 0x55555555;
      int y = 0xaaaaaaaa;
         System.out.println("x: " + Integer.toBinaryString(x));
        System.out.println("y: " + Integer.toBinaryString(y));

   
        System.out.println("x & y: " + Integer.toBinaryString(x & y));
        System.out.println("x | y: " + Integer.toBinaryString(x | y));
        System.out.println("x ^ y: " + Integer.toBinaryString(x ^ y));
        System.out.println("~x: " + Integer.toBinaryString(~x));
        System.out.println("~y: " + Integer.toBinaryString(~y));

}
}