package com.mycompany.app.EX_Tuan_1.EX;

public class bt10 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (VampireNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean VampireNumber(int i) 
    {
        for (int j = 10; j < 100; j++) {
            if(((i%j==0)&&(i/j>=10))&&(i/j<100))
            return true;
        }
        return false;
    }
}
