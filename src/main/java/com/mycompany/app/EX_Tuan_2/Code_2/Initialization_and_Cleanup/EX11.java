package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX11 {
    String numberCheck;

public EX11(String numberCheck) {
        this.numberCheck = numberCheck;
    }

protected void finalize() {
        System.out.println("Finalizing number: " + numberCheck);
      
    }
    @SuppressWarnings("unused")

public static void main(String[] args) {
        EX11 resource = new EX11("Number.txt");
        System.gc();
    }
}




