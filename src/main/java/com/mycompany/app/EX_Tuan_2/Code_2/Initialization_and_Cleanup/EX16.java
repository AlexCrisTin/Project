package com.mycompany.app.EX_Tuan_2.Code_2.Initialization_and_Cleanup;

public class EX16 {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "hello";
        array[1] = "hellooo";
        array[2] = "are you listen to me?";
        array[3] = "hello?";
        array[4] = "joke over, you are dead";
        for(int i = 0 ; i < array.length; i++){
            System.out.println(i +" "+ array[i]);
        }
    }
}
