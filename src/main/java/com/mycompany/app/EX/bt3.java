package com.mycompany.app.EX;
import java.util.Random;
public class bt3 {
    public static void main(String[] agrs){
    
        Random random = new Random();
        while(1==1){
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
    
}
