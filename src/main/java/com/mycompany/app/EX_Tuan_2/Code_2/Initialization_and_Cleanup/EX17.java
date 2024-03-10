package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX17 {
    String message;
   public static void main(String[] args) {
    String[] array = new String[5];
     
    for(int i = 0; i < array.length; i++){
        if (array[i] == null) {
            System.out.println("Element " + i + " is null.");
    }
}
}
}