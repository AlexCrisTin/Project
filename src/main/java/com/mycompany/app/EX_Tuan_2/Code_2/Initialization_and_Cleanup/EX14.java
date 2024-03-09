package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX14 {
    static String string1 = "Point of definition";

    static String string2;
    static {
        string2 = "Static block";
    
}
public void print(){
    System.out.println("Static Field 1: " + string1);
        System.out.println("Static Field 2: " + string2);

}
public static void main(String[] args) {
    EX14 printl = new EX14();
    printl.print();
}
}