package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX11 {
    String numberCheck;

public EX11(String numberCheck) {
        this.numberCheck = numberCheck;
    }

protected void finalize() {
        System.out.println("Finalizing number: " + numberCheck);
      
    }
<<<<<<< HEAD
    @SuppressWarnings("unused")
=======

@SuppressWarnings("unused")
>>>>>>> ac97752a3cf10f9d01b72e9df5c738af2d71548f
public static void main(String[] args) {
        EX11 resource = new EX11("Number.txt");
        System.gc();
    }
}




