package com.mycompany.app.EX_Tuan_1.EX;


    public class bt9 {
        public static void main(String[] args) {
            int n = 20;
            int x = 1, y = 0;
            for(int i = 0; i < n; i++ ){
                int z = x + y;
                x = y;
                y = z;
                System.out.println(z);
            }
        } 
    }
    

    

