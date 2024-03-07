package com.mycompany.app.EX_Tuan_2.Initialization_and_Cleanup;

public class EX7 {
    public void mess(){
        System.out.println("MESSgae from outside");
    }
    public static void main(String[] args) {
        EX7 me = new EX7();
        me.mess();
    }
}
