package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX18 {
    String message;
    void constructor (String input){
        message = input;
        System.out.println("Constructor called with argument: " + input);
    }
    public static void main(String[] args) {
        EX18[] array = new EX18[5];
        array[0] = new EX18();
        array[1] = new EX18();
        array[2] = new EX18();
        array[3] = new EX18();
        array[4] = new EX18();
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ": " + array[i].getMyString());
        }
    }
    public String getMyString() {
        return message;
    }
    }

