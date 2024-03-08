package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX9 {
    String name;
    public EX9() {
        this("Overload"); 
    }
    public EX9(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        EX9 out1 = new EX9();
        out1.display();

        EX9 out2 = new EX9("Another overload");
        out2.display(); 
    }
}
