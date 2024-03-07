package com.mycompany.app.EX_Tuan_2.Initialization_and_Cleanup;

public class EX8 {
    public void method1(){
        System.out.println("Method 1");

    }
    public EX8 method2(){
        System.out.println("Method 2");
        return this;
    }
    public static void main(String[] args) {
        EX8 me = new EX8();
        System.out.println();
        System.out.println(me.method2());
    }
}
//can't create without using this