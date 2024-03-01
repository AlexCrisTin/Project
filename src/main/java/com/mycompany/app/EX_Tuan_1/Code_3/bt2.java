package com.mycompany.app.EX_Tuan_1.Code_3;
import java.util.Random;
public class bt2 {
     public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i <= 25; i++){
        int num1 = random.nextInt(100)+1;
        int num2 = random.nextInt(100)+1;
            for(int j = 0; j < 25; j++){
            if(num1 < num2){
                System.out.println("Num1 < Num2");
            }
            if(num1 > num2){
                System.out.println("Num1 > Num2");
            }
            else
                System.out.println("Num1 = Num2");
        }
        }
        
    }
}

