package com.mycompany.app.EX;

public class bt4 {
    public static void main(String[] agrs){
        int x = 100; 
        for(int i = 0; i < x; i++){
            boolean t = true;
            for(int j = 2; j < i; j++){
                 if(i % j == 0){
                    t = false;
                    break;
                }
            }
            if(t){
                System.out.println(i);
            }
        }
    }
}