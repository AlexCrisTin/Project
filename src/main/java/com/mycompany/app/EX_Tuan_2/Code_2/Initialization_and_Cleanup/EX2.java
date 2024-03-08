package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX2 {
    String firstString = "This is first string";
    String secondString;
    EX2(String val){
        secondString = val;
    }
    public static void main(String[] args) {
        EX2 call = new EX2("This is second string");
        System.out.println(call.firstString);
        System.out.println(call.secondString);

    }
}
