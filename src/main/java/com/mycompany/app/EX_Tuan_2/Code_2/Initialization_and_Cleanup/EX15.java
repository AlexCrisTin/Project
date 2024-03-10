package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX15 {
    String string;
    {
        string = "This is a string using instance  initialization";
    }
    public String MyString() {
        return string;
    }
    public static void main(String[] args) {
        EX15 display = new EX15();
       System.out.println(display.string);
    }
}
