package com.mycompany.app.EX_Tuan_1.EX;

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
            if(t&&i>1){ //0 voi 1 khong phai so nguyen to
                System.out.println(i);
            }
        }
    }
}