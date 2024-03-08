package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

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
        me.method1();
        System.out.println(me.method2());
    }
}
